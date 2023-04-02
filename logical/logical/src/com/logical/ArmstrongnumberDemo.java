package com.logical;

import java.util.Scanner;

//Armstrong number is a number that is equal to 
//the sum of cubes of its digits.
//For example 0, 1, 153, 370, 371 and 407 
//are the Armstrong numbers.

public class ArmstrongnumberDemo {

	public static void main(String[] args) {
		
		
		try(Scanner s=new Scanner(System.in)){
			
			System.out.println("enter no here");
			int i=s.nextInt();
			//i=153;
			
			int length=0;
			int n=i;
			
			//finding length
			while(n>0) {
				
				length=length+1;
				n=n/10;
			}
					
			
			int n1=i;
			int r=0;
			int m=1;
			int arm=0;
			
			while(n1>0) {
				
				//finding reminder or number on each digit
			r=n1%10;
			
			//finding multiplication
			for(int j=1;j<=length;j++) {
			m=r*m;
			}
		
			//Adding multiplication with arm
			arm=arm+m;
			
			
			//reducing number
			n1=n1/10;
			
			//resetting multiplication value
			m=1;
			
			}
			
		if(i==arm) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		}

	}

}
