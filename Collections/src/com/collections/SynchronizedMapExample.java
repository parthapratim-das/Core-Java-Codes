package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.*;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("one", "Apple");
		map.put("two", "banana");
		map.put("three", "Potato");
		
		Map newMap = Collections.synchronizedMap(map);
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+ " "+ me.getValue());
		}

	}

}
