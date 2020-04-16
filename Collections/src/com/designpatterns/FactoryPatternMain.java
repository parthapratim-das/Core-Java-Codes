package com.designpatterns;

public class FactoryPatternMain {

	public static void main(String[] args) {
		
		String planType = "DomesticPlan";
		int unit = 12;
		
		PlanFactory pf = new PlanFactory();
		Plan p = pf.getInstance(planType);
		
		p.getRate();
		p.calculateAmount(unit);

	}

}
