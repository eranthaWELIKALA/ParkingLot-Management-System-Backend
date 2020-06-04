package com.uop.co.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
