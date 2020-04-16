package com.lambdaexp;

import java.util.function.Function;

public class FunctionWithLambda {

	public static void main(String[] args) {
		
		//get the length of a string using function, apply
		Function<String,Integer> f = s -> s.length();
		
		System.out.println(f.apply("Partha"));
		
		//convert a string characters to upper case
		Function<String, String> fu = s -> s.toUpperCase();
		System.out.println(fu.apply("partha"));
		
		

	}

}
