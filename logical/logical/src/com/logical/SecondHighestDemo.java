package com.logical;

public class SecondHighestDemo {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 2, 6, 7 };
		int[] b = new int[7];
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		
		System.out.println("second largest no is :" + a[5]);
		System.out.println("Ascending order Sorting :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}