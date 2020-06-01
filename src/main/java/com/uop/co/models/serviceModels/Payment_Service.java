package com.uop.co.models.serviceModels;

import java.util.UUID;

public class Payment_Service {
	
	private String id;
	private String type;
	private UUID reservationId;
	private String userNIC;
	private int amount;
	private boolean settled;
	
	public Payment_Service() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public UUID getReservationId() {
		return reservationId;
	}
	public void setReservationId(UUID reservationId) {
		this.reservationId = reservationId;
	}
	public String getUserNIC() {
		return userNIC;
	}
	public void setUserNIC(String userNIC) {
		this.userNIC = userNIC;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isSettled() {
		return settled;
	}

	public void setSettled(boolean settled) {
		this.settled = settled;
	}
}
