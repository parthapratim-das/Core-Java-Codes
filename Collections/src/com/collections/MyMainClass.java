package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MyMainClass {
	
	public static void main(String[] args) {
		
		CollectionsTest cl =  new CollectionsTest(10, "First", 811.12);
		CollectionsTest cl1 = new CollectionsTest(20, "Second", 222.23);
		CollectionsTest cl3 = new CollectionsTest(30, "Third", 333.34);
		
		ArrayList<CollectionsTest> collList = new ArrayList<CollectionsTest>();
		collList.add(cl);
		collList.add(cl1);
		collList.add(cl3);
		
		Collections.sort(collList);
		
		for(CollectionsTest collEle : collList){
			System.out.println(collEle.getCid()+" "+
								collEle.getCname()+" "+
								collEle.getCval());
		}
		
		
		ArrayList<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell", 8, 800,""));
		laps.add(new Laptop("Apple", 4, 1000,""));
		laps.add(new Laptop("Acer", 6, 700,""));
		
		LaptopComparator lcmp = new LaptopComparator();
		Collections.sort(laps, lcmp);
		
		for(Laptop l : laps){
			System.out.println(l.getCname() + " " + l.getRam() + " " + l.getPrice());
		}
		
		
	}

}

class LaptopComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getRam() > o2.getRam())
			return 1;
		else
			return -1;
	}

	

}

