package com.logical;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
	try(Scanner s=new Scanner(System.in)){
		System.out.println("enter starting number here ");
		int i1=s.nextInt();
		System.out.println("enter end number here ");
		int i2=s.nextInt();
		int[] even=new int[i2];
		int[] odd=new int[i2];
		int n=i1;
		int l=i2;
		int j=0;
		int k=0;
		System.out.println("even no");
		for(int i=n;i<=l;i++) {
			
		if(i%2==0) {
			//System.out.print(i+" ");
			even[j]=i;
			j++;
		}
		else {
			//System.out.print("odd number :"+i);
			odd[k]=i;
			k++;
		}
		}
		for(int s1=0;s1<even.length;s1++) {
			if(even[s1]!=0) {
			System.out.println(even[s1]);
		}}
	}

}}
