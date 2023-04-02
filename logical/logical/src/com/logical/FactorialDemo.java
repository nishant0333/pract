package com.logical;

import java.util.Scanner;

public class FactorialDemo {
	

	public static void main(String[] args) {
		int n=1;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter your no here :");
			int i=s.nextInt();
			for(int j=i;j>=1;j--) {
				n=n*j;
			}
			System.out.println("factorial of "+i+" is :"+n);
		}
		
	}

}
