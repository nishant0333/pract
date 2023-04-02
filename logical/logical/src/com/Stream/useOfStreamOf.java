package com.Stream;

import java.util.stream.Stream;

public class useOfStreamOf {

	public static void main(String[] args) {
		
		//we use Stream.of(i) for reference type  like integer or class
		//for primitive type we have to use Arrays.stream(i)
		Integer [] i= {1,23,4,5,6,7,8,9,12};
Stream.of(i).forEach(System.out::println);
	}

}
