package com.logical;

import java.util.Scanner;

public class primeMethod {
	int p=0;
	public int primeNo(int n) {
		for(int i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				break;
			}else {
				p=n;
			}
		}
		
		
		return p;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int s=sc.nextInt();
primeMethod r=new primeMethod();

int t=r.primeNo(s);

System.out.println("test"+t);
if(t !=0) {
System.out.println("prime no :"+t);
	}
else {
	System.out.println("not prime");
}
	}

}
