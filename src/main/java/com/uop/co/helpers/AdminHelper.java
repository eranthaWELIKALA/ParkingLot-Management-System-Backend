package com.uop.co.helpers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uop.co.enums.UserType;
import com.uop.co.models.Floor;
import com.uop.co.models.Slot;
import com.uop.co.models.User;
import com.uop.co.repositories.FloorRepository;
import com.uop.co.repositories.SlotRepository;
import com.uop.co.repositories.UserRepository;
import com.uop.co.util.exceptions.SlotsFullException;

@Component
public class AdminHelper {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired 
	private FloorRepository floorRepo;
	
	@Autowired SlotRepository slotRepo;
	
	public User createAdmin(User admin) throws Exception{
		String nic = admin.getNic();
		Optional<User> existingAdminResponse = userRepo.findById(nic);
		User existingAdmin;
		try {
			existingAdmin = existingAdminResponse.get();
		}
		catch(NoSuchElementException ex) {
			existingAdmin = null;
		}
		if(existingAdmin==null) {
			admin.setType(UserType.ADMIN);
			admin = userRepo.save(admin);
		}		
		return admin;
	}
	
	public List<Floor> getFloors() throws Exception{
		return floorRepo.findAll();
	}
	
	public List<Floor> addFloor(Floor floor) throws Exception{
		floorRepo.save(floor);
		return floorRepo.findAll();
	}
	
	public List<Floor> updateFloor(Floor floor) throws Exception{
		floorRepo.save(floor);
		return floorRepo.findAll();
	}
	
	public List<Floor> deleteFloor(int floorId) throws Exception{
		floorRepo.deleteById(floorId);
		return floorRepo.findAll();
	}
	
	public List<Slot> getSlots() throws Exception{
		return slotRepo.findAll();
	}
	
	public List<Slot> addSlot(Slot slot) throws Exception{
		int floorNo = slot.getFloorNo();
		boolean ableToAddSlot = ableToAddSlot(floorNo);
		if(ableToAddSlot) {
			slotRepo.save(slot);
		}
		else {
			throw new SlotsFullException();
		}
		return slotRepo.findAll();
	}
	
	public List<Slot> updateSlot(Slot slot) throws Exception{
		slotRepo.save(slot);
		return slotRepo.findAll();
	}
	
	public List<Slot> deleteSlot(int slotId) throws Exception{
		slotRepo.deleteById(slotId);
		return slotRepo.findAll();
	}
	
	
	
	// private methods	
	private boolean ableToAddSlot(int floorNo) throws Exception{
		boolean result = false;
		Optional<Floor> res = floorRepo.findById(floorNo);
		if(res.isPresent()) {
			Floor floor = res.get();
			int maxSlotCount = floor.getNoOfSlots();
			int slotCount = slotRepo.getSlotsByFloorNo(floorNo);
			if(slotCount>=maxSlotCount) {
				return false;
			}
			else {
				return true;
			}			
		}
		else {
			// nothing to do
		}
		return result;
	}
}
