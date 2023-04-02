package com.jtc.C1;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args ) {
	System.out.println("Enter year to check leapYear");
	
	Scanner s = new Scanner(System.in);
	int year = s.nextInt();
	if(year % 4 == 0) {
		
		if(year % 100 == 100) {
			
			if(year % 400 == 400) {
				
				System.out.println("Leap year");
				
			}else {
				
				System.out.println("not leap year");
			}
		}else {
			
			System.out.println("leap year");
			
		}
		
	}else {
		System.out.println("not leap year");
		
	}
}
	
}
