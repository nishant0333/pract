package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class freqStream {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,2,3,3,3,4,4,5,2);
		
Map<Integer,Long>map=l.stream()
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


Map<Integer,Long>map1=l.stream()
.collect(Collectors.groupingBy(a->a,Collectors.counting()));	

System.out.println(map);

System.out.println(map1);
	}

}
