package com.function;

import java.util.function.Function;

public class Squire {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(6));

	}

}
