package com.StringReverse;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Hello World";
		
		String rev = "";
		
		if(str == null)
			rev = "";
		else{
			for(int i = str.length()-1; i>=0; i--){
				rev = rev + str.charAt(i);
			}
		}
		
		System.out.println(rev);
	}

}
