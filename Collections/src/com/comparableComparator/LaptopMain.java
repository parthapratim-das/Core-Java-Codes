package com.comparableComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopMain {

	public static void main(String[] args) {
		
		List<Laptop> laptops = Laptop.getLaptopDummyData();
		
		Collections.sort(laptops);
		
		for(Laptop l : laptops){
			System.out.println(l.getRamSize()+" "+l.getCompany()+" "+l.getPrice());
		}
		
		Comparator<Laptop> cpr = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				return o1.getPrice()>o2.getPrice()?1:o1.getPrice()<o2.getPrice()?-1:0;
			}
			
		};
		
		Collections.sort(laptops,cpr);
		for(Laptop l : laptops){
			System.out.println(l.getRamSize()+" "+l.getCompany()+" "+l.getPrice());
		}
		

	}

}
