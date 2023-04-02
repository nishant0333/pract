package com.logical;

public class ThirdSmallestDemo {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 2, 6, 7 };
		int[] b = new int[7];
		int temp, count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		int k=0;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if(count == 1) {
				b[k] = a[i];
				k++;
			}
		}

		
		System.out.println("Asecanding order Sorting :");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("Third Smallest no is :" + b[2]);
	}

}
