package com.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter 
@Setter
@Accessors(chain =true)
public abstract class Shape implements Cloneable{

	private String id;
	protected String type;
	
	abstract void draw();
	
	
	
	public Object  clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return obj;
	}


}
