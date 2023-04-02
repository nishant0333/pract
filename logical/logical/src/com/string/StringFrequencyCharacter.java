package com.string;

import java.util.*;

public class StringFrequencyCharacter {

	public static void main(String[] args) {
		String s = "test of test";
		char ch[] = s.toCharArray();
		HashMap<Character, Integer> h = new HashMap<>();

		for (char c : ch) {
if(!String.valueOf(c).isBlank()) {
			if (h.containsKey(c)) {
				h.put(c,h.get(c) + 1);

			} else {
				h.put(c, 1);
			}
}}
		Set<Map.Entry<Character, Integer>> sh = h.entrySet();
		for (Map.Entry<Character, Integer> c1 : sh) {
			System.out.println(c1.getKey() + ":" + c1.getValue());
		}
	}

}
