package com.comparableComparator;

import java.util.ArrayList;
import java.util.List;

public class Laptop implements Comparable<Laptop>{
	
	int ramSize;
	String company;
	double price;
	
	
	public Laptop(int ramSize, String company, double price) {
		this.ramSize = ramSize;
		this.company = company;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static List<Laptop> getLaptopDummyData(){
		
		List<Laptop> laptops  = new ArrayList<Laptop>();
		laptops.add(new Laptop(4,"Dell",36000));
		laptops.add(new Laptop(8,"Lenovo",40500));
		laptops.add(new Laptop(8,"HP",37650));
		laptops.add(new Laptop(4,"Apple",66000));
		
		return laptops;
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		return this.getRamSize()>o.getRamSize()?1:this.getRamSize()<o.getRamSize()?-1:0;
	}
	
	
	

}
