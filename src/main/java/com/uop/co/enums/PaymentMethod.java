package com.uop.co.enums;

public enum PaymentMethod {
	CASH_PAYMENT("CashPayment"),
	ONLINE_PAYMENT("OnlinePayment");
	
	private String method;
	
	PaymentMethod(String method){
		this.method = method;
	}
	
	@Override
	public String toString() {
		return this.method;
	}
	
}
