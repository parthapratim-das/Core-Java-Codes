package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayList {
	
	public static void main(String[] args)
	{
	
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		for(int itr : intList)
		{
			System.out.println(itr+" ");
			//intList.add(5);
		}
		
		CopyOnWriteArrayList<Integer> intListCpy = new CopyOnWriteArrayList<Integer>();
		
		intListCpy.add(1);
		intListCpy.add(2);
		intListCpy.add(3);
		intListCpy.add(4);
		
		for(int itr : intListCpy)
		{
			System.out.println(itr+" ");
			intListCpy.add(3);
		}
		System.out.println(intListCpy);
	}
	
}
