package com.logical;

public class primeRange {

	public static void main(String[] args) {

		int n = 1;
		int l = 20;
		int p = 0;
		boolean b = false;
		for (int i = n; i <= l; i++) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					b = true;
					break;

				} else {
					p = i;
					b = false;
				}
			}
			
			if (b==false) {
				if(p!=0) {
				System.out.println("prime :"+p);
				}
			}
		}
		

	}

}
