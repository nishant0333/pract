package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Minimum_Demo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		
		
		Integer integer = list.stream()
				.min((a,b) -> {return a.compareTo(b);}).get();
		System.out.println(integer);

	}

}
