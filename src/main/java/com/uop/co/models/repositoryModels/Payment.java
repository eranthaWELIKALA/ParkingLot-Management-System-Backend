package com.uop.co.models.repositoryModels;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.uop.co.enums.PaymentMethod;
import com.uop.co.enums.PaymentType;
import com.uop.co.models.User;

@Entity
@Table(name="Payment", uniqueConstraints = @UniqueConstraint(columnNames = {"reservation_id"}))
public class Payment {
	
	@Id
	@Column(length = 36)
	private String id;
	
	@Enumerated(EnumType.STRING)
	private PaymentType type; // monthly_subscription, daily_subscription, registration
	
	@Enumerated(EnumType.STRING)
	private PaymentMethod method; // cash, online
	
	@OneToOne
	@JoinColumn(name = "reservation_id", foreignKey = @ForeignKey(name = "RESERVATION_ID"))
	private Reservation reservation;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="user_nic", nullable = false, foreignKey = @ForeignKey(name = "USER_NIC"))
	private User user;
	
	private int amount;
	private Date date;
	private boolean settled;
	
	public Payment() {
		super();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public PaymentType getType() {
		return type;
	}
	
	public void setType(PaymentType type) {
		this.type = type;
	}
	
	public PaymentMethod getMethod() {
		return method;
	}

	public void setMethod(PaymentMethod method) {
		this.method = method;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user= user;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isSettled() {
		return settled;
	}

	public void setSettled(boolean settled) {
		this.settled = settled;
	}
	
	
}
