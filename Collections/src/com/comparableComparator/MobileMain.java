package com.comparableComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MobileMain {

	public static void main(String[] args) {

		List<Mobile> mobiles = Mobile.getMobileDummyData();
		
		Comparator<Mobile> compare = new Comparator<Mobile>(){
			
			public int compare(Mobile m1, Mobile m2){
				if(m1.getPrice()>m2.getPrice()){
					return 1;
				}else{
					return -1;
				}
			}
			
		};
		
		Collections.sort(mobiles,compare);
	}

}
