package com.uop.co.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uop.co.models.Floor;
import com.uop.co.repositories.FloorRepository;

@Service
public class FloorService {
	
	@Autowired
	private FloorRepository repo;
	
	public List<Floor> getFloors() throws Exception{
		return repo.findAll();
	}
	
	public List<Floor> addFloor(Floor floor) throws Exception{
		repo.save(floor);
		return repo.findAll();
	}
	
	public List<Floor> updateFloor(Floor floor) throws Exception{
		repo.save(floor);
		return repo.findAll();
	}
	
	public List<Floor> deleteFloor(Floor floor) throws Exception{
		repo.delete(floor);
		return repo.findAll();
	}

}
