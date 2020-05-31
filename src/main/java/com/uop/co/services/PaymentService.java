package com.uop.co.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.models.repositoryModels.Payment;
import com.uop.co.models.serviceModels.Payment_Service;
import com.uop.co.repositories.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repo;
	
	public List<Payment> getPayments() throws Exception{
		return repo.findAll();
	}
	
	public List<Payment> createPayment(Payment_Service payment_s) throws Exception{
		Payment payment = new Payment();
		
		String type = payment_s.getType();
		UUID reservationId = payment_s.getReservationId();
		String userNIC = payment_s.getUserNIC();
		int amount = payment_s.getAmount();
		boolean settled = payment_s.isSettled();
		
		payment.setType(type);
		payment.setReservationId(reservationId);
		payment.setUserNIC(userNIC);
		payment.setAmount(amount);
		payment.setSettled(settled);
		
		repo.save(payment);
		return repo.findAll();
	}
	
	public List<Payment> updatePayment(Payment payment) throws Exception{
		repo.save(payment);
		return repo.findAll();
	}
	
	public List<Payment> deletePayment(String paymentId) throws Exception{
		repo.deleteById(paymentId);
		return repo.findAll();
	}
	
	public List<Payment> settlePayment(Payment payment) throws Exception{
		payment.setSettled(true);
		repo.save(payment);
		return repo.findAll();
	}

}
