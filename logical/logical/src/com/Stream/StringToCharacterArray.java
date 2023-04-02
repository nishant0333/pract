package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToCharacterArray {

	public static void main(String[] args) {
		String s="nishanta";
		
		Character[] chh = s.chars().mapToObj(e -> (char)e)
				.toArray(Character[]::new);
		
		
		List<Character> list1 = Arrays.stream(chh).collect(Collectors.toList());
			System.out.println(list1);

	}

}
