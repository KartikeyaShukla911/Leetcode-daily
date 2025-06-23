package com.parking.model;

public class ParkingSpot {

	private Vehicle vehicle;
	private boolean isFree;
	private int spotId;
	
	public ParkingSpot(int spotId)
	{
		this.spotId = spotId;
		this.isFree = true;
	}
	
	public boolean parkVehicle(Vehicle v)
	{
		this.vehicle = v;
		return true;
	}
	
	public boolean unPark(Vehicle v)
	{
		if(!isFree)
		{
			this.vehicle = null;
			this.spotId=0;
			this.isFree = true;
			return true;
		}
		return false;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
}
