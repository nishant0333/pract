package com.predicate;

import java.util.function.Predicate;

public class DivisibleBy2 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i % 2 == 0;
		System.out.println(p1.test(3));
		System.out.println(p1.test(10));

	}

}
