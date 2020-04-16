package com.comparableComparator;

import java.util.ArrayList;
import java.util.List;

public class Mobile {
	
	int ramSize;
	String company;
	Double screenSize;
	double price;
	
	
	public Mobile(int ramSize, String company, Double screenSize, double price) {
		super();
		this.ramSize = ramSize;
		this.company = company;
		this.screenSize = screenSize;
		this.price = price;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(Double screenSize) {
		this.screenSize = screenSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static List<Mobile> getMobileDummyData(){
		List<Mobile> mobiles = new ArrayList<Mobile>();
		
		mobiles.add(new Mobile(4,"Samsung",5.2,15000));
		mobiles.add(new Mobile(4,"Xiaomi",5.4,19900));
		mobiles.add(new Mobile(4,"Motorola",5.0,14099));
		mobiles.add(new Mobile(4,"Apple",5.2,45000));
		return mobiles;
	}

}
