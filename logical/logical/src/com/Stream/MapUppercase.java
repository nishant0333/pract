package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class MapUppercase {

	public static void main(String[] args) {
		List<String>s=Arrays.asList("ram","mohan");
List<String>s1=s.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
	System.out.println(s1);
	s.stream().map(e->e.length()).forEach(System.out::println);
	System.out.println("////////////////////////");
	s.stream().map(e->e.length()).forEach(d->System.out.println(d));
	
	}

}
