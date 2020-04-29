package com.uop.co.helpers;

import com.uop.co.enums.PaymentMethod;
import com.uop.co.enums.UserType;

public class UserHelper {
	
	public static String selectUserType(String type) throws Exception{
		// setting user type
		String userType = null;
		if(type.equals("REGISTERED")) {
			userType = UserType.REGISTERED.toString();
		}
		else if(type.equals("SINGLE_TIME")) {
			userType = UserType.SINGLE_TIME.toString();
		}
		else {
			// nothing to do
		}
		return userType;
	}
	
	public static String selectPaymentMethod(String method) throws Exception{
		// setting user type
		String paymentMethod = null;
		if(method.equals("CASH_PAYMENT")) {
			paymentMethod = PaymentMethod.CASH_PAYMENT.toString();
		}
		else if(method.equals("ONLINE_PAYEMNT")) {
			paymentMethod = PaymentMethod.ONLINE_PAYMENT.toString();
		}
		else {
			// nothing to do
		}
		return paymentMethod;
	}

}
