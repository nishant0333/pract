package com.logical;

public class palindromNumberDemo {

	public static void main(String[] args) {
		int d=12;
		int n=d;
		
	int t=0;
		while(n>0) {
			int r=n%10;
			t=t*10+r;
			n=n/10;
			
		}
		System.out.println(t);
		if(d==t) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("not palindrom ");
		}
	}


}
