package com.parking.model;

import com.parking.model.type.VehicleType;

public class Vehicle {
	private String number;
	private String color;
	private VehicleType type;
	
	public Vehicle(String number,String color,VehicleType type)
	{
		this.number = number;
		this.color = color;
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}
	
}
