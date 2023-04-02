package com.logical;

public class ReverseAnumber {

	public static void main(String[] args) {
		
		int number=123;
		
	int reverseNumber=0;
		while(number>0) {
			int remender=number%10;
			reverseNumber=reverseNumber*10+remender;
			number=number/10;
			
		}
		System.out.println(reverseNumber);
		
	}

}
