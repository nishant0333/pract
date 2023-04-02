package com.Stream;

import java.util.Arrays;

public class useOfArraysStream {

	public static void main(String[] args) {
		
		//for primitive type we use Arrays.stream(a)
		int a[] = { 1, 2, 3, 4, 5 };

		Arrays.stream(a).forEach(System.out::println);

	}

}
