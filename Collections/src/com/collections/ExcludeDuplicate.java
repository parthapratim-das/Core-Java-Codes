package com.collections;

import java.util.*;

public class ExcludeDuplicate {
	
	public static void main(String[] args){
		
		Map<String,Integer> hm = new HashMap<>();
		hm.put("one",1);
		hm.put("two",2);
		hm.put("dup",1);
		
		Iterator itr = hm.entrySet().iterator();
		
		Set<Integer> hs = new HashSet<>();
		while(itr.hasNext()){
			Map.Entry<String, Integer> mapElement = (Map.Entry<String, Integer>)itr.next();
			int temp = mapElement.getValue();
			hs.add(temp);
		}
		
		
		System.out.println(hs);
	}


}
