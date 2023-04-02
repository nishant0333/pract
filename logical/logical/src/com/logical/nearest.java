package com.logical;

import java.util.Arrays;

public class nearest {
public static void main(String[] args) {
	int a[]= {3,1,5,2,7,10,15};
	int n=8;
	int temp=0;
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	int b[]=a;
	System.out.println(Arrays.toString(b));
	
}
}
// 3,1,5,2,7,10,15
//1,2,3,5,7,10,15


