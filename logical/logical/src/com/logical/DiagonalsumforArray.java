package com.logical;

public class DiagonalsumforArray {

	public static void main(String[] args) {
		int a1[] = { 5, 2, 3 };
		int a2[] = { 4, 5, 6 };
		int a3[] = { 1, 2, 3 };
		
		int a=a1[0]+a2[1]+a3[2];
		int b=a1[2]+a2[1]+a3[0];
		System.out.println(a);
		System.out.println(b);
		System.out.println(a-b);
	}

}
