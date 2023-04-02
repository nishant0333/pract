package com.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30, 35 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		for (int x1 : x) {
			if (p2.negate().test(x1)) {
				System.out.println(x1);

				/*
				 * if (p2.and(p2).test(x1)) { System.out.println(x1);
				 * 
				 * 
				 * if (p2.or(p2).test(x1)) { System.out.println(x1);
				 */
			}

		}

	}

}
