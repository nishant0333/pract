package com.lang;

public class ArrayCopyDemo {
public static void main(String[] args)throws Exception{
	int a[]= {1,2,3,4,5,6,7};
	int b[]= new int[15];
	System.arraycopy(a, 2, b, 0, 3);
	for (int i=0;i<3;i++) {
		System.out.println(b[i]);
	}
}
}
