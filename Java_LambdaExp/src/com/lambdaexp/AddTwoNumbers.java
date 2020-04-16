package com.lambdaexp;

@FunctionalInterface
interface Adder{
	public int add(int a, int b);
}

@FunctionalInterface
interface SquareIt{
	public int square(int n);
}


public class AddTwoNumbers {

	public static void main(String[] args) {
		Adder add = (a,b) -> a+b;
		System.out.println(add.add(10, 20));
		
		SquareIt sqr = (n) -> n*n;
		System.out.println(sqr.square(5));

	}

}
