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

import com.uop.co.models.Floor;
import com.uop.co.models.Slot;
import com.uop.co.models.User;
import com.uop.co.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService service;
	
	// create a user
	@PostMapping("/createAdmin")
	public User createUser(@RequestBody User admin) throws Exception{
		return service.createAdmin(admin);
	}
	
	@GetMapping("/getFloors")
	public List<Floor> getFloors() throws Exception{
		return service.getFloors();
	}
	
	@PostMapping("/createFloor")
	public List<Floor> addFloor(@RequestBody Floor floor) throws Exception{
		return service.addFloor(floor);
	}
	
	@PutMapping("/updateFloor")
	public List<Floor> updateFloor(@RequestBody Floor floor) throws Exception{
		return service.updateFloor(floor);
	}
	
	@DeleteMapping("/deleteFloor")
	public List<Floor> deleteFloor(@RequestParam("id") int floorNo) throws Exception{
		return service.deleteFloor(floorNo);
	}
	
	@GetMapping("/getSlots")
	public List<Slot> getSlots() throws Exception{
		return service.getSlots();
	}
	
	@PostMapping("/createSlot")
	public List<Slot> addSlot(@RequestBody Slot slot) throws Exception{
		return service.addSlot(slot);
	}
	
	@PutMapping("/updateSlot")
	public List<Slot> updateSlot(@RequestBody Slot slot) throws Exception{
		return service.updateSlot(slot);
	}
	
	@DeleteMapping("/deleteSlot")
	public List<Slot> deleteSlot(@RequestParam("id") int slotId) throws Exception{
		return service.deleteSlot(slotId);
	}

}
