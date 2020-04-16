package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModification {

	public static void main(String[] args) {
		
		Map<String,Integer> oldMap = new ConcurrentHashMap<>();
		
		oldMap.put("one", 1);
		oldMap.put("two", 2);
		oldMap.put("three", 3);
		
		for(Map.Entry<String, Integer> entry : oldMap.entrySet())
		{
			System.out.println(entry.getKey()+" -> "+entry.getValue());
			oldMap.put("four", 4);
		}

	}

}
