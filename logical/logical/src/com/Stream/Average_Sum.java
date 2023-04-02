package com.Stream;
import java.util.*;

import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Average_Sum {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		
		
		Double avg=list.stream()
				.collect(Collectors.averagingInt(e->e));
		System.out.println(avg);
		
	Integer sum=list.stream()
			.collect(Collectors.summingInt(e->e));
	System.out.println(sum);
	}
	}
	


