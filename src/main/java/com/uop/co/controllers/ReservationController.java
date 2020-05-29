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

import com.uop.co.models.repositoryModels.Reservation;
import com.uop.co.models.serviceModels.Reservation_Service;
import com.uop.co.services.ReservationService;

@RestController
@RequestMapping(value="/reservation")
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
	@GetMapping("/get")
	public List<Reservation> getReservations() throws Exception{
		return service.getReservations();
	}
	
	@PostMapping("/create")
	public List<Reservation> createReservation(@RequestBody Reservation_Service reservation_s) throws Exception{
		return service.createReservation(reservation_s);
	}
	
	@PutMapping("/update")
	public List<Reservation> updateReservation(@RequestBody Reservation reservation) throws Exception{
		return service.updateReservation(reservation);
	}
	
	@DeleteMapping("/delete")
	public List<Reservation> deleteReservation(@RequestParam("id") String reservationId) throws Exception{
		return service.deleteReservation(reservationId);
	}
	
	// This should happen only once the payment is paid
	@PutMapping("/checkout")
	public List<Reservation> checkOutReservation(@RequestBody Reservation reservation) throws Exception{
		return service.checkoutReservation(reservation);
	}

}
