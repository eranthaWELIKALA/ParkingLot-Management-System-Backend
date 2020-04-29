package com.uop.co.util.exceptions;

public class SlotsFullException extends Exception{
	
	public SlotsFullException() {
		super("All the slots are filled in the corresponding floor");
	}

}
