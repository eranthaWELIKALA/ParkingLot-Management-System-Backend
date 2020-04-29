package com.uop.co.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uop.co.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
	
	@Query(value= "SELECT * FROM vehicle v WHERE v.vehicle_no = ?1", nativeQuery = true)
	Vehicle findByVehicleNo(String vehicleNo);

}
