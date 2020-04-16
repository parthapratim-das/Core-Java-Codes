package com.stringduplicate;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateCount {

	public static void main(String[] args) {
		
		String oldString = "I am am learning java java";
		
		String[] wordList = oldString.split(" ");
		
		Map<String,Integer> finalMap = new HashMap<String,Integer>();
		
		for(String itr : wordList)
		{
			int value = 1;
			if(finalMap.containsKey(itr))
			{
				int temp = finalMap.get(itr);
				temp=temp+1;
				finalMap.put(itr, temp);
			}
			else
			{
				finalMap.put(itr, value);
			}
		}
		
		for(Map.Entry<String, Integer> entry : finalMap.entrySet())
		{
			System.out.println("Word: "+entry.getKey() + 
								" Occurance: "+entry.getValue());
		}

	}

}
