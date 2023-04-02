package com.test;

import java.util.Scanner;

public class calc {
	
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter A");
    int  a=sc.nextInt();
	System.out.println("Enter B");
	int b=sc.nextInt();
	System.out.println("Enter D");
	int d=sc.nextInt();
	
	int c=0;
	System.out.println("enter operation");
	String string=sc.nextLine();
	
	switch (a) {
	case 1: c=d+b;
		System.out.println(c);
		break;
	case 2:c=d-b;
		System.out.println(c);
		break;
	case 3:c=d*b;
		System.out.println(c);
		break;
		
	case 4:c=d/b;
		System.out.println(c);
		
		default:System.out.println("plz enter 1 to 4");
		
	
	
	}}}
	


