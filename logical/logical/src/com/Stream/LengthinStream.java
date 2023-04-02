package com.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class LengthinStream {

	public static void main(String[] args) {
		List<String> n = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");
		List<String> fn = n.stream()
				.filter(e -> e.length() > 6 && e.length() < 8)
				.collect(Collectors.toList());
		System.out.println(fn);
	}

}
