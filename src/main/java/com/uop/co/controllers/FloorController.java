package com.uop.co.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uop.co.models.Floor;
import com.uop.co.services.FloorService;

@RestController
@RequestMapping(value="/floor")
public class FloorController {
	
	@Autowired
	private FloorService service;
	
	@GetMapping("/get")
	public List<Floor> getFloors() throws Exception{
		return service.getFloors();
	}
	
	@PostMapping("/create")
	public List<Floor> addFloor(@RequestBody Floor floor) throws Exception{
		return service.addFloor(floor);
	}
	
	@PutMapping("/update")
	public List<Floor> updateFloor(@RequestBody Floor floor) throws Exception{
		return service.updateFloor(floor);
	}
	
	@DeleteMapping("/delete")
	public List<Floor> deleteFloor(@RequestBody Floor floor) throws Exception{
		return service.deleteFloor(floor);
	}
}
