package com.creational.factory;

public class FactoryPattern {

	public static void main(String[] args) {

		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle v1 = vehicleFactory.getVehicleInstance("twowheeler");
		v1.showVehicle();
		
		
		
	}

}
