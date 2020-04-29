package com.uop.co.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Floor")
public class Floor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int floorNo;
	private int noOfSlots;
	
	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getFloorNo() {
		return this.floorNo;
	}
	
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public int getNoOfSlots() {
		return noOfSlots;
	}

	public void setNoOfSlots(int noOfSlots) {
		this.noOfSlots = noOfSlots;
	}
	
}
