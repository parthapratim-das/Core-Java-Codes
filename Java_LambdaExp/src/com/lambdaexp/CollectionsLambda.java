package com.lambdaexp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1>o2)?1:(o1<o2)?-1:0;
	}
	
}*/

public class CollectionsLambda {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(23);
		list.add(18);
		
		//Collections.sort(list,new myComparator());
		Comparator<Integer> c = (o1,o2) -> (o1>o2)?1:(o1<o2)?-1:0;
		Collections.sort(list,c);
		System.out.println(list);

	}

}
