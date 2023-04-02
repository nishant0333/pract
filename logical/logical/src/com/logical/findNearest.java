package com.logical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findNearest {

	public static void main(String[] args) {
		int n = 9;

		int a[] = { 1, 3, 4, 5, 7, 10, 15 };

		Arrays.sort(a);
		int cc = (Arrays.binarySearch(a, n));
		System.out.println("cc: " + cc);
		if (cc >= 0) {
			System.out.print("search number is present :" + a[cc]);
		} else {
			if (cc > -(a.length) && cc <= 0) {
				int c = -(cc);
				System.out.println("c :" + c);
				int d = n - a[c - 2];
				int e = a[c - 1] - n;
				// System.out.println("D :" + d + "" + " E :" + e);
				if (d < e) {
					int f = a[c - 2];
					System.out.println("nearset f :" + f);
				} else if (e < d) {
					int g = a[c - 1];
					System.out.println("nearset g :" + g);
				} else {
					int h = a[c - 2];
					System.out.println("nearset h :" + h);
				}
				System.out.println("test1");
			} else {
				System.out.println("AA nearest :" + a[a.length - 1]);
				System.out.println("test 2");
			}

		}
	}
}
