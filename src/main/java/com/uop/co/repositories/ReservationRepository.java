package com.uop.co.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uop.co.models.repositoryModels.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String>{

}
