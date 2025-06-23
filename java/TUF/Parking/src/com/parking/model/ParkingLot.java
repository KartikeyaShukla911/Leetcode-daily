package com.parking.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.parking.service.CalculateFare;

public class ParkingLot {

	private List<ParkingFloor> floors;
    private Map<String, Long> entryTimeMap;

    public ParkingLot(int numFloors, int spotsPerFloor) {
        floors = new ArrayList<>();
        entryTimeMap = new HashMap<>();
        for (int i = 0; i <= numFloors; i++) {
            floors.add(new ParkingFloor(i, spotsPerFloor));
        }
    }
	
	public void parkIt(int floor, Vehicle vehile)
	{
		ParkingFloor currFloor = floors.get(floor);
		ParkingSpot freeSpot = currFloor.getFreeSpot();
		freeSpot.parkVehicle(vehile);
		entryTimeMap.put(vehile.getNumber(), System.currentTimeMillis());
	}
	
	public void unPark(Vehicle vehicle)
	{
		for(ParkingFloor floor : floors)
		{
			List<ParkingSpot> spots = floor.getAllSpots();
			for(ParkingSpot spot : spots)
			{
				if(spot.isFree()) {
					Vehicle currentSpotVehicle = spot.getVehicle();
					if(currentSpotVehicle.getNumber().equals(vehicle.getNumber()))
					{
						spot.unPark(vehicle);
						long duration = entryTimeMap.get(currentSpotVehicle.getNumber());
						System.out.println("Total Charges: "+ CalculateFare.getPrice(duration));
						return;
					}
				}
			}
		}
		System.out.println("Vehicle not found");
	}
}
