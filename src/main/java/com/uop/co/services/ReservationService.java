package com.uop.co.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.helpers.ReservationHelper;
import com.uop.co.models.repositoryModels.Reservation;
import com.uop.co.models.serviceModels.Reservation_Service;
import com.uop.co.repositories.ReservationRepository;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository repo;
	
	@Autowired ReservationHelper helper;
	
	public List<Reservation> getReservations() throws Exception{
		return repo.findAll();
	}
	
	public List<Reservation> createReservation(Reservation_Service reservation_s) throws Exception{
		Reservation reservation = new Reservation();
		
		String userId = reservation_s.getUserId();
		int slotId = reservation_s.getSlotId();
		String vehicleNo = reservation_s.getVehicleNo();		
		Date date = reservation_s.getDate();
		int startTime = reservation_s.getStartTime();
		int endTime = reservation_s.getEndTime();
		
		String vehicleId = helper.getVehicleIdByVehicleNo(vehicleNo);
		
		reservation.setUserId(userId);
		reservation.setSlotId(slotId);
		reservation.setVehicleId(vehicleId);
		reservation.setDate(date);
		reservation.setStartTime(startTime);
		reservation.setEndTime(endTime);
		
		repo.save(reservation);
		return repo.findAll();
	}
	
	public List<Reservation> updateReservation(Reservation reservation) throws Exception{
		repo.save(reservation);
		return repo.findAll();
	}
	
	public List<Reservation> deleteReservation(String reservationId) throws Exception{
		repo.deleteById(reservationId);
		return repo.findAll();
	}
	
	public List<Reservation> checkoutReservation(Reservation reservation) throws Exception{
		reservation.setCheckedOut(true);
		repo.save(reservation);
		return repo.findAll();
	}

}
