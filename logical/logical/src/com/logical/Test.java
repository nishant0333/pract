package com.logical;

import java.util.Scanner;

//prime number from 1 to 100


class Test {
	public static void main(String[] args) {
	int t=0;
	int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting no :");
		int a=sc.nextInt();
		System.out.println("enter the last no :");
		int b=sc.nextInt();
		count=0;
		for(int j=a;j<=b;j++) {
			boolean flag = false;
		
			for (int i = 2; i<=(j/2); i++) {
				if (j % i == 0) {
					flag = true;
					
					break;
				} else {
					
					flag = false;
					count++;
				}

			}
			
			if (flag==false) {
				System.out.print("Prime No :"+j);
				System.out.println();
			} else {
				//System.out.print("Not Prime no :"+j);
			}
		
		}
		
		System.out.println(count);
	}
}
