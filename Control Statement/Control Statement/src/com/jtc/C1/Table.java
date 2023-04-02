package com.jtc.C1;

import java.util.Scanner;

public class Table {
	
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number for Table");
		int no = s.nextInt();
		
		for(int i=1;i<=25;i++) {
			
			System.out.println(no+"*"+i+"="+no*i);
		}
		
		
	}

}
