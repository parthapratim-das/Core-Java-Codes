package com.failfastfailsafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class failfastfailsafemain {

	public static void main(String[] args) {

		ArrayList<Integer> listOne = new ArrayList<Integer>();
		
		listOne.add(10);
		listOne.add(20);
		listOne.add(15);
		listOne.add(17);
		listOne.add(23);
		listOne.add(13);
		
		Iterator itr = listOne.iterator();
		while(itr.hasNext())
		{
			System.out.println((Integer)itr.next());
			
			//listOne.add(16);
			
		}
		
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("one",12);
		hm.put("two",25);
		hm.put("three",36);
		hm.put("four",55);
		
		for(Entry<String,Integer> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + "->"+entry.getValue());
		}
		
	}

}
