package com.uop.co.helpers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uop.co.models.User;
import com.uop.co.models.repositoryModels.Reservation;
import com.uop.co.repositories.ReservationRepository;
import com.uop.co.repositories.UserRepository;

@Component
public class PaymentHelper {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	
	public User getUserByNIC(String nic) throws Exception{
		User user = null;
		Optional<User> optionalUser = userRepo.findById(nic);
		if(optionalUser.isPresent()) {
			user = optionalUser.get();
		}
		return user;
	}
	
	public Reservation getReservationById(String reservationId) throws Exception{
		Reservation reservation = null;
		Optional<Reservation> optionalReservation = reservationRepo.findById(reservationId);
		if(optionalReservation.isPresent()) {
			reservation = optionalReservation.get();
		}
		return reservation;
	}
	
}
