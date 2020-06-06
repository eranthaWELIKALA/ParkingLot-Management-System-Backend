package com.uop.co.helpers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uop.co.models.User;
import com.uop.co.repositories.UserRepository;

//import com.uop.co.models.Vehicle;
//import com.uop.co.repositories.VehicleRepository;

@Component
public class ReservationHelper {
	
//	@Autowired
//	private VehicleRepository vehicleRepo;
	
//	public String getVehicleIdByVehicleNo(String vehicleNo) throws Exception{
//		Vehicle vehicle = vehicleRepo.findByVehicleNo(vehicleNo);
//		if(vehicle!=null) {
//			return vehicle.getId().toString();
//		}
//		else {
//			return "0";
//		}
//		
//	}
	
	@Autowired
	private UserRepository userRepo;
	public User getUserByNIC(String nic) throws Exception{
		User user = null;
		Optional<User> userOptional = userRepo.findById(nic);
		if(userOptional.isPresent()) {
			user = userOptional.get();
		}
		return user;
	}
}
