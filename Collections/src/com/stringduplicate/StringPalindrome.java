package com.stringduplicate;

public class StringPalindrome {

	public static void main(String[] args) {
		
		
		String string = "aabbcbbaag";
		int flag = 0;
		for(int i=string.length()-1, j = 0; i >=0 && j<= string.length()-1; i--,j++)
		{
			if(string.charAt(i) != string.charAt(j))
			{
				flag = 1;
			}
		}
		
		if(flag == 0){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}

	}

}
