package com.uop.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.models.Slot;
import com.uop.co.repositories.SlotRepository;

@Service
public class SlotService {
	
	@Autowired
	private SlotRepository repo;
	
	public List<Slot> getSlots() throws Exception{
		return repo.findAll();
	}

}
