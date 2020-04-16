package com.collections;

import java.io.Serializable;

public class Laptop implements Serializable{
	
	String cname;
	int ram;
	double price;
	transient String code;
	
		
	public Laptop(String cname, int ram, double price, String code) {
		super();
		this.cname = cname;
		this.ram = ram;
		this.price = price;
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
}
