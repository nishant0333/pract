package com.test;

import java.util.Scanner;

public class even {
	static int c;
	static int b;
	public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			
			System.out.println("Enter first Number");
			c =scanner.nextInt();
			System.out.println("Enter second number");
			b=scanner.nextInt();
			System.out.print("even:  ");
		for(int a=c;a<=b;a++) {
			if(a%2==0)
				System.out.print(a+" ");
		}
		System.out.println();
		System.out.print("odd:  ");
		for(int a=c;a<=b;a++) {
			if(a%2!=0)
				System.out.print(a+" ");
		}	
	}
}
