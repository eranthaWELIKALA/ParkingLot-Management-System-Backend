package com.uop.co.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uop.co.models.repositoryModels.Payment;
import com.uop.co.models.serviceModels.Payment_Service;
import com.uop.co.services.PaymentService;

@RestController
@RequestMapping(value="/payment")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@GetMapping("/get")
	public List<Payment> getPayments() throws Exception{
		return service.getPayments();
	}
	
	@PostMapping("/create")
	public List<Payment> createPayment(@RequestBody Payment_Service payment_s) throws Exception{
		return service.createPayment(payment_s);
	}
	
	@PutMapping("/update")
	public List<Payment> updatePayment(@RequestBody Payment payment) throws Exception{
		return service.updatePayment(payment);
	}
	
	@DeleteMapping("/delete")
	public List<Payment> deletePayment(@RequestParam("id") String paymentId) throws Exception{
		return service.deletePayment(paymentId);
	}

}
