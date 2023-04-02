package com.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseOfStreamOfOnString {

	public static void main(String[] args) {
		String d="nishant";
		
		
		List<String> collect = Stream.of(d).map(E->E.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
