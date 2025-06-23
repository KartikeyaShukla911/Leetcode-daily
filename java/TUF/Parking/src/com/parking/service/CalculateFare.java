package com.parking.service;

public class CalculateFare {
	private static long fare=20;
	
	public static long getPrice(long time)
	{
		return (int)(System.currentTimeMillis() - time)*fare;
	}
}
