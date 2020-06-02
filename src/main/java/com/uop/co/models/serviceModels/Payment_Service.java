package com.uop.co.models.serviceModels;

public class Payment_Service {
	
	private String id;
	private String type;
	private String reservation_id;
	private String user_nic;
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
	public String getReservationId() {
		return reservation_id;
	}
	public void setReservationId(String reservationId) {
		this.reservation_id = reservationId;
	}
	public String getUserNIC() {
		return user_nic;
	}
	public void setUserNIC(String userNIC) {
		this.user_nic = userNIC;
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
