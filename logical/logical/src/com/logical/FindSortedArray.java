package com.logical;

public class FindSortedArray {

	public static void main(String[] args) {
		int a[] = {5,4,2,1};
		System.out.println("Aesc :"+isAscending(a));
	    System.out.println("desc :"+isDescending(a));
		
		if(isAscending(a)==true||isDescending(a)==true) {
			System.out.println("sorted");
		}
		if(isAscending(a)==false && isDescending(a)==false) {
			System.out.println("not sorted");
		}

	}

	 static boolean isAscending(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					return false;
				}

			}
		}
		return true;
	}
	 static boolean isDescending(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					return false;
				}

			}
		}
		return true;
	}
}
