package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class useOfToArray {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer [] i=l.stream().toArray(Integer[]::new);
		
		for (Integer i1 : i) {
			System.out.println(i1);
		}

		System.out.println(";;;;;;;;;;;;;use of stream.of();;;;;;;;;;;;;");
		Stream.of(i).forEach(System.out::println);
	}

}
