package com.logical;

public class filter {

	public static void main(String[] args) {
	int a1[]= {1,3,4};
	int a2[]= {1,4,4};
	int a3[]= {4,2,3};
	//int a[]=new int[a1.length];
	//int b[]=new int[a1.length];
	int a=0;
	int b=0;
	a=a+a1[0]+a2[1]+a3[2];
	b=b+a1[2]+a2[1]+a3[0];
	System.out.println(a-b);
	
	}

}
