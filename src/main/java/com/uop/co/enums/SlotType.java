package com.uop.co.enums;

public enum SlotType {
	BIKE("Bike"),
	THREE_WHEEL("ThreeWheel"),
	FOUR_WHEEL_VEHICLE("FourWheelVehicle"),
	BUS_LORRY("BusLorry");
	
	String type;
	
	SlotType(String type){
		this.type = type;
	}
	
	@Override
	public String toString(){
		return this.type;
	}
}
