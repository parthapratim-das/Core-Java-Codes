package com.creational.prototype;

import java.util.Hashtable;

public class PrototypeCache {
	
	private static Hashtable<String,Shape> cacheObjects =
			new Hashtable<String, Shape>();
	
	public static void loadCache() {
		
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Triangle triangle = new Triangle();
		
		rectangle.setId("r1");
		cacheObjects.put(rectangle.getId(), rectangle);
		
		square.setId("s1");
		cacheObjects.put(square.getId(), square);
		
		triangle.setId("t1");
		cacheObjects.put(triangle.getId(), triangle);
	}
		
	public static Shape getShape(String id)
	{
		Shape cachedShape = cacheObjects.get(id);
		return (Shape) cachedShape.clone();
	}
				

	

}
