package com.logical;

public class FindMissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		
		int n=a.length+1;
		
		int expSum=(n*(n+1))/2;
		
		System.out.println(expSum);
		
	int sum=0;
	for(int i=0;i<a.length;i++) {
		
		sum=sum+a[i];
		
	}
System.out.println("missing no is :"+(expSum-sum));
	}
}
