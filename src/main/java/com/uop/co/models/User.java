package com.uop.co.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue
	private UUID id;
	
	@Column(unique=true)
	private String nic;
	private String firstname;
	private String lastname;
	private String email;
	private String contactNo;
	private String type;
	private String paymentMethod;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
