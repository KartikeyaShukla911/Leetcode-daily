package com.parking.controller;

import com.parking.model.ParkingFloor;
import com.parking.model.ParkingLot;
import com.parking.model.Vehicle;
import com.parking.model.type.VehicleType;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingLot lot = new ParkingLot(4, 4);
		Vehicle bike = new Vehicle("KA01", "blue", VehicleType.BIKE);
		Vehicle car = new Vehicle("KA02", "red", VehicleType.CAR);
		
		lot.parkIt(2, car);
		lot.parkIt(4, bike);
		
		lot.unPark(car);
		lot.unPark(bike);
	}
}
