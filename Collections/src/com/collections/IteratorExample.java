package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
