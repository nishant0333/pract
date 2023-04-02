package com.Stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSortingOnValues {

	public static void main(String[] args) {
	
		
		Map<Integer,String> m= new HashMap<>();
		
		m.put(1, "A");
		m.put(2, "B");
		m.put(3, "G");
		m.put(4, "D");
		m.put(5, "F");
		m.put(6, "C");
		m.put(7, "A");
		m.put(8, "E");
		
		m.entrySet().stream().
	sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(e -> {System.out.println(e);});
		
		System.out.println(".............................");
		Map<Integer,String>map=m.entrySet().stream().
	sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).
	collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(a1,a2) -> a1,LinkedHashMap::new));
		
		System.out.println(map);
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		
		m.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}
}
