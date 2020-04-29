package com.uop.co.enums;

public enum UserType {
	SINGLE_TIME("SingleTime"),
	REGISTERED("Registered"),
	ADMIN("Admin");
	
	private String type;
	
	UserType(String type){
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.type;
	}
}
