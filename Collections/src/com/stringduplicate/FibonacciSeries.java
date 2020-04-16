package com.stringduplicate;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int tn_1 = 0;
		int tn = 1;
		int limit = 10;
		System.out.print(tn_1+" "+tn+" ");
		for(int i = 3;i<=limit; i++){
			int tnn = tn_1 + tn;
			tn_1 = tn;
			tn = tnn;
			System.out.print(tnn+" ");
		}

	}

}
