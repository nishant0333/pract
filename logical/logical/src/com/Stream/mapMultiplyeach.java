package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class mapMultiplyeach {

	public static void main(String[] args) {
		List<Integer>i=Arrays.asList(2,3,4,5,6,7);
//i.stream().map(e->e*3).forEach(System.out::println);
		List<Integer>s=i.stream().map(e->e*3).collect(Collectors.toList());
	System.out.println(s);
	}

}
