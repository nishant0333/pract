package com.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,2,1);
	
	
	Integer integer = list.stream().distinct()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst().get();
	
	System.out.println(integer);

	}

}
