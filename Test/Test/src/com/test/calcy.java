package com.test;

import java.util.Scanner;

public class calcy {
	static int a;
	static int b;
	static String c;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		System.out.println("enter first number (in nubler only)");
		a =scanner.nextInt();
		
		System.out.println("enter second number (in nubler only)");
		b=scanner.nextInt();
		
		System.out.println("enter operation : ADD,SUB,MUL,DIV");
		c=scanner.next();
		int d=0;
		try {
			switch (c) {
			case "ADD":d=a+b;
			System.out.println("result :"+d);
			break;
			case "SUB":d=a-b;
			System.out.println("result :"+d);
			break;
			
			case "MUL":d=a*b;
			System.out.println("result :"+d);
			break;
			case "DIV":d=a/b;
			System.out.println("result :"+d);
			break;	
				
			
			default:System.out.println("enter valid keyword form above");
				
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		//System.out.println("Result :"+d);
		
		
		
		
	}


}
