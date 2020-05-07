package com.creational.factory;

public class VehicleFactory {
	
	public Vehicle getVehicleInstance(String type)
	{
		if(type.equalsIgnoreCase("twowheeler"))
		{
			return new TwoWheeler();
		}
		else if(type.equalsIgnoreCase("threewheeler"))
		{
			return new ThreeWheeler();
		}
		else if(type.equalsIgnoreCase("fourwheeler"))
		{
			return new FourWheeler();
		}
		else 
			return null;
	}

}
