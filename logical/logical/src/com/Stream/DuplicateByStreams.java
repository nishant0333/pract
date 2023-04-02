package com.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateByStreams {

	public static void main(String[] args) {
		List<Integer> l = Arrays
				.asList(1, 3, 10, 20, 30, 15, 1, 3, 1, 2, 10, 30, 1, 3);
		Set<Integer> dup = l.stream()
				.filter(e -> Collections.frequency(l, e) > 1)
				.collect(Collectors.toSet());
		System.out.println(dup);

		// --------------OR-------------------------------

		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> du = l.stream().filter(e -> !s.add(e))
				.collect(Collectors.toSet());
		Set<Integer> du1 = l.stream().filter(e -> s.add(e) == false)
				.collect(Collectors.toSet());
		System.out.println(du);
		System.out.println("test" + du1);

		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''");

		List<Integer> lst = l.stream().limit(2)
				.collect(Collectors.toList());
		List<Integer> lst1 = l.stream().skip(2)
				.collect(Collectors.toList());
		Optional<Integer> lst2 = l.stream().skip(2).findFirst();
		List<Integer> lst3 = l.stream().distinct()
				.collect(Collectors.toList());
		System.out.println(lst);
		System.out.println(lst1);
		System.out.println(lst2.get());
		System.out.println(lst3);

		Optional<Integer> op = l.stream().sorted().max((v1, v2) -> {
			return v1.compareTo(v2);
		});
		System.out.println("max :" + op.get());
		List<Integer> in = l.stream().distinct()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(in);
	}

}
