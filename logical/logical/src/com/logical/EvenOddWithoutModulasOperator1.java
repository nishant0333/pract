package com.logical;

import java.util.Scanner;

public class EvenOddWithoutModulasOperator1 {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("enter number here");
			int number=sc.nextInt();
			int result=(number/2)*2;
			
			if(result == number) System.out.println("even");
				
			else  System.out.println("odd");
				
				
		}	
	}

}
