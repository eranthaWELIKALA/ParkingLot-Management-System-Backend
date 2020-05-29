package com.uop.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.helpers.SlotHelper;
import com.uop.co.models.Slot;
import com.uop.co.repositories.SlotRepository;
import com.uop.co.util.exceptions.SlotsFullException;

@Service
public class SlotService {
	
	@Autowired
	private SlotRepository repo;
	@Autowired
	private SlotHelper helper;
	
	public List<Slot> getSlots() throws Exception{
		return repo.findAll();
	}
	
	public List<Slot> addSlot(Slot slot) throws Exception{
		int floorId = slot.getFloorId();
		boolean ableToAddSlot = helper.ableToAddSlot(floorId);
		if(ableToAddSlot) {
			repo.save(slot);
		}
		else {
			throw new SlotsFullException();
		}
		return repo.findAll();
	}
	
	public List<Slot> updateSlot(Slot slot) throws Exception{
		repo.save(slot);
		return repo.findAll();
	}
	
	public List<Slot> deleteSlot(int slotId) throws Exception{
		repo.deleteById(slotId);
		return repo.findAll();
	}

}
