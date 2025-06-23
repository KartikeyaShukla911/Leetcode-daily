package com.parking.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

	private List<ParkingSpot> spots;
	private int floor;
	
	public ParkingFloor(int floorNumber,int numSpot)
	{
		this.floor=floorNumber;
		this.spots=new ArrayList();
		for(int i=0;i<numSpot;i++)
		{
			spots.add(new ParkingSpot(i));
		}
	}
	
	
	public ParkingSpot getFreeSpot() {
		for(ParkingSpot spot : spots)
		{
			if(spot.isFree())
				return spot;
		}
		return null;
	}
	
	public List<ParkingSpot> getAllSpots()
	{
		return spots;
	}
}
