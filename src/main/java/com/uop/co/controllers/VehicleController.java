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

import com.uop.co.models.Vehicle;
import com.uop.co.services.VehicleService;

@RestController
@RequestMapping(value="/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService service;
	
	@GetMapping("/get")
	public List<Vehicle> getVehicles() throws Exception{
		return service.getVehicles();
	}
	
	@PostMapping("/create")
	public List<Vehicle> addVehicle(@RequestBody Vehicle vehicle) throws Exception{
		return service.addVehicle(vehicle);
	}
	
	@PutMapping("/update")
	public List<Vehicle> updateVehicle(@RequestBody Vehicle vehicle) throws Exception{
		return service.updateVehicle(vehicle);
	}
	
	@DeleteMapping("/deletee")
	public List<Vehicle> deleteVehicle(@RequestParam("id") String vehicleId) throws Exception{
		return service.deleteVehicle(vehicleId);
	}

}
