package com.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringToCharacter {

	public static void main(String[] args) {
		String s = "nishant";
		

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}
		
		
		System.out.println(list);
		List<Character> c = list.stream().distinct().collect(Collectors.toList());
		System.out.println(c);

		System.out.println("'''''''''''''''''''''");
		Map<Character, Long> map = list.stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		System.out.println(map);
	
		
		
	}

}
