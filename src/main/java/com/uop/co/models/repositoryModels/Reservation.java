package com.uop.co.models.repositoryModels;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Reservation")
public class Reservation {

	@Id
	@GeneratedValue
	private UUID id;
	private String userId;
	private int slotId;
	private String vehicleId;
	private Date date;
	private int startTime;
	private int endTime;
	private boolean checkedOut;
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	
}
