package com.logical;

public class Fibonachi {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=8;i++) {
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

	}

}
