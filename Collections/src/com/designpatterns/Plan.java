package com.designpatterns;

abstract class Plan {
	
	protected double rate;
	abstract void getRate();
	public void calculateAmount(int units){
		System.out.println(units*rate);
	}

}
