package com.logical;

public class FindMaxMinSingleFor {

	public static void main(String[] args) {
		int a[]= {1,34,23,20,25};
		int max,min;
		max=min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			 if (a[i]<min) 
				min=a[i];
			
		}
		System.out.println("max :"+max+" "+"min :"+min);

	}

}
