package com.uop.co.helpers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.uop.co.models.Floor;
import com.uop.co.repositories.FloorRepository;
import com.uop.co.repositories.SlotRepository;

@Component
public class SlotHelper {
	
	@Autowired
	private FloorRepository floorRepo;
	@Autowired
	private SlotRepository slotRepo;
	
	public boolean ableToAddSlot(int floorId) throws Exception{
		boolean result = false;
		Optional<Floor> res = floorRepo.findById(floorId);
		if(res.isPresent()) {
			Floor floor = res.get();
			int maxSlotCount = floor.getNoOfSlots();
			int slotCount = slotRepo.getSlotsByFloorId(floorId);
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
