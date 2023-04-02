package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FrequencyMoreThanTwo {
	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		
		
		Map<Integer, Long> map = li.stream()
				.collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		System.out.println(map);
		
		
		Set<Entry<Integer, Long>> s = map.entrySet();

		for (Entry<Integer, Long> s1 : s) {
			if (s1.getValue() > 1) {
				System.out.println(s1);
			}
		}
	}
}
