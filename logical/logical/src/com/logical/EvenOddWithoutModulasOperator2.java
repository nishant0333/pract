package com.logical;

public class EvenOddWithoutModulasOperator2 {
	public static void main(String[] args) {

		boolean flag=true;
		int n=2;
		for(int i=1;i<=n;i++) {
			flag=!flag;
			
		}
		if(flag==true) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}				
}
