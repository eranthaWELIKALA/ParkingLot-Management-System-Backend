package com.uop.co.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uop.co.models.Slot;

public interface SlotRepository extends JpaRepository<Slot, Integer>{
	
	@Query(value = "SELECT COUNT(*) FROM slot s WHERE s.floorNo = ?1", nativeQuery = true)
	int getSlotsByFloorNo(int floorId);
}
