package com.creational.prototype;

public class PrototypePattern {

	public static void main(String[] args) {

		
		PrototypeCache.loadCache();
		
		Shape cloneRectangle = PrototypeCache.getShape("r1");
		System.out.println(cloneRectangle.getType());
		
	}

}
