package com.uop.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.helpers.AdminHelper;
import com.uop.co.models.Floor;
import com.uop.co.models.Slot;
import com.uop.co.models.User;

@Service
public class AdminService {
	
	@Autowired
	private AdminHelper helper;
	
	public List<Floor> getFloors() throws Exception{
		return helper.getFloors();
	}
	
	public User createAdmin(User admin) throws Exception{
		return helper.createAdmin(admin);
	}
	
	public List<Floor> addFloor(Floor floor) throws Exception{
		return helper.addFloor(floor);
	}
	
	public List<Floor> updateFloor(Floor floor) throws Exception{
		return helper.updateFloor(floor);
	}
	
	public List<Floor> deleteFloor(int floorId) throws Exception{
		return helper.deleteFloor(floorId);
	}
	
	public List<Slot> getSlots() throws Exception{
		return helper.getSlots();
	}
	
	public List<Slot> addSlot(Slot slot) throws Exception{
		return helper.addSlot(slot);
	}
	
	public List<Slot> updateSlot(Slot slot) throws Exception{
		return helper.updateSlot(slot);
	}
	
	public List<Slot> deleteSlot(int slotId) throws Exception{
		return helper.deleteSlot(slotId);
	}
}
