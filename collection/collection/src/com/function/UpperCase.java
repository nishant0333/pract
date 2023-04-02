package com.function;

import java.util.function.Function;

public class UpperCase {

	public static void main(String[] args) {
		Function<String, String> f = s -> s.toUpperCase();
		System.out.println(f.apply("nishant"));

	}

}
