package com.uop.co.enums;

public enum VehicleType {
	BIKE("Bike"),
	THREE_WHEEL("ThreeWheel"),
	FOUR_WHEEL_VEHICLE("FourWheelVehicle"),
	BUS_LORRY("BusLorry");
	
	String type;
	
	VehicleType(String type){
		this.type = type;
	}
	
	@Override
	public String toString(){
		return this.type;
	}
}
