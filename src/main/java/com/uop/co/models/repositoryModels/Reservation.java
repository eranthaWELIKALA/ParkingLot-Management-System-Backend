package com.uop.co.models.repositoryModels;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.uop.co.models.User;

@Entity
@Table(name="Reservation")
public class Reservation {

	@Id
	@Column(length=36)
	private String id;
	
	private int slotId;
	private String vehicleNo;
	private Date date;
	private float startTime;
	private float endTime;
	private boolean checkedIn;
	private boolean checkedOut;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "user_nic", nullable = false, foreignKey = @ForeignKey(name = "USER_NIC"))
	private User user;
	
	public Reservation() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getStartTime() {
		return startTime;
	}

	public void setStartTime(float startTime) {
		this.startTime = startTime;
	}

	public float getEndTime() {
		return endTime;
	}

	public void setEndTime(float endTime) {
		this.endTime = endTime;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}	
	
}
