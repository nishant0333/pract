package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,3,5,6,7);
		
		List<Integer> list2 = list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("Min  : "+ list2.get(0));
		System.out.println("Max  : "+ list2.get(list2.size()-1));

	}

}
