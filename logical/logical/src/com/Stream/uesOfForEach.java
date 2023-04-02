package com.Stream;

import java.util.Arrays;
import java.util.List;

public class uesOfForEach {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,23,4,5,5,6,7);
l.stream().forEach(System.out::println);

	}

}
