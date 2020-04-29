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

import com.uop.co.models.Slot;
import com.uop.co.services.SlotService;

@RestController
@RequestMapping(value="/slot")
public class SlotController {
	
	@Autowired
	private SlotService service;
	
	@GetMapping("/get")
	public List<Slot> getSlots() throws Exception{
		return service.getSlots();
	}
	
	@PostMapping("/create")
	public List<Slot> addSlot(@RequestBody Slot slot) throws Exception{
		return service.addSlot(slot);
	}
	
	@PutMapping("/update")
	public List<Slot> updateSlot(@RequestBody Slot slot) throws Exception{
		return service.updateSlot(slot);
	}
	
	@DeleteMapping("/delete")
	public List<Slot> deleteSlot(@RequestBody Slot slot) throws Exception{
		return service.deleteSlot(slot);
	}

}
