package com.uop.co.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
public class Vehicle {

	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(unique=true)
	private String vehicleNo;
	private String vehicleType;
		
	public Vehicle() {
		super();
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

}
