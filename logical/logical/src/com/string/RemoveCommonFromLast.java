package com.string;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveCommonFromLast {

	public static void main(String[] args) {
		String[] s= {"apple","orangs","Banana","pinapple"};
//		List<String> list=Arrays.asList(s);
//		List<String> str=list.stream().filter(f->!f.endsWith("a")).collect(Collectors.toList());
//		System.out.println(str);
		Map<Character, String> map2 = Stream.of(s).collect(Collectors.toMap(e->e.charAt(0),e->e));
		System.out.println(map2);
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;");
		Map<Character, String> map=new HashMap<Character,String>();
		for(String s1:s) {
			//map.put(s1.charAt(s1.length()-1),s1);
			map.put(s1.charAt(0),s1);
		}
		System.out.println(map);
	Set<Entry<Character,String>> set=map.entrySet();
	
	for(Entry<Character, String> s2:set) {
		System.out.println(s2.getKey()+" : "+s2.getValue());
	  }
	}

}
