package com.creational.prototype;

public class Triangle extends Shape{
	
	public Triangle() {
		type = "Triangle";
	}
	
	@Override
	void draw() {
		System.out.println("Triangle object created");
		
	}

}
