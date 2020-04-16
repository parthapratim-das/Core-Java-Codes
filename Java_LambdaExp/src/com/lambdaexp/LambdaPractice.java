package com.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Addition{
	public int add(int a,int b);
}

public class LambdaPractice {

	public static void main(String[] args) {
		Addition add = (int a, int b) -> a+b;
		System.out.println(add.add(10,20) );
		
		
		//Sorting a collection 
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(30);
		intList.add(20);
		intList.add(70);
		intList.add(50);
		intList.add(60);
		
		Comparator<Integer> cpr =  (o1,o2) -> (o1>o2)?1:(o1<o2)?-1:0;
		Collections.sort(intList,cpr);
		
		System.out.println(intList);
		
		
	}

}
