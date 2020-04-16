package com.designpatterns;

public class PlanFactory {
	
	public Plan getInstance(String planType){
		
		if(planType.equalsIgnoreCase("DomesticPlan"))
			return new DomesticPlan();
		if(planType.equalsIgnoreCase("CommercialPlan"))
			return new CommercialPlan();
		return null;
		
	}

}
