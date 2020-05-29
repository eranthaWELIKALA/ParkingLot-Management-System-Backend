package com.uop.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.models.Vehicle;
import com.uop.co.repositories.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository repo;
	
	public List<Vehicle> getVehicles() throws Exception{
		return repo.findAll();
	}
	
	public List<Vehicle> addVehicle(Vehicle vehicle) throws Exception{
		repo.save(vehicle);
		return repo.findAll();
	}
	
	public List<Vehicle> updateVehicle(Vehicle vehicle) throws Exception{
		repo.save(vehicle);
		return repo.findAll();
	}
	
	public List<Vehicle> deleteVehicle(String vehicleId) throws Exception{
		repo.deleteById(vehicleId);
		return repo.findAll();
	}
	
}
