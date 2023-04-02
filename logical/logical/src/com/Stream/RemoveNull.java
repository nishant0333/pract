package com.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNull {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("cup", "forest", "sky", "book", null, "jug", null);
		List<String> fl = l.stream().filter(e -> e != null).collect(Collectors.toList());
		System.out.println(fl);
	}

}
