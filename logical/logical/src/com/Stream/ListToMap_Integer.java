package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap_Integer {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,1,1,2,4,5,6);
	
	 Map<Integer,Integer>r=l.stream().distinct().collect(Collectors.toMap(e->e,e->5));
	System.out.println(r);
	}
}
