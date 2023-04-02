package com.logical;

public class FirstDUpli {

	public static void main(String[] args) {

		int[] a = { 6, 5, 3, 2, 5, 1, 2, 4 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0 + i; j < a.length - 1; j++) {
				if ((a[i] == a[j] && i != j)) {
					temp = temp + 1;
					System.out.println("First Duplicate Element is : " + a[j]);
					break;
				}
			}
			if (temp > 0) {
				break;
			}
		}

	}

}
