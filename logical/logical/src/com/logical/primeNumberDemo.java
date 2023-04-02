package com.logical;

public class primeNumberDemo {
	public static void main(String[] args) {
		int n =17;
		boolean flag = false;
		for (int i = 2; i<=n-1; i++) {
			if (n % i == 0) {
				flag = true;
				break;
			} else {
				flag = false;
			}

		}
		if (flag==false) {
			System.out.println("Prime No");
		} else {
			System.out.println("Not Prime no");
		}
	}
}
