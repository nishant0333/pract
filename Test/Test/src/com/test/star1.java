package com.test;

public class star1 {
	static int a;

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				a = a + 1;
				System.out.print(a);
			}
			System.out.println();
		}
	}
}
