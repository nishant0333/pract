package com.logical;
//find number of digits and its sum
public class CountDemo {

	public static void main(String[] args) {
		int no=12345;
		int count=0;
		int sum=0;
		while(no>0) {
		int r=no%10;
		sum=sum+r;
		count++;
		no=no/10;	
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
