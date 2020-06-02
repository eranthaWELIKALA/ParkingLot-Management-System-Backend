package com.uop.co.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.uop.co.enums.UserType;

import javax.persistence.Id;

@Entity
@Table(name = "User")
public class User {

	@Id
	@Column(length=20)
	private String nic;
	
	private String firstname;
	private String lastname;
	private String email;
	private String contactNo;
	
	@Enumerated(EnumType.STRING)
	private UserType type; // Unregistered, Registered, Admin
	
	private String subscriptionType; // monthly, daily

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

}
