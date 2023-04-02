package Streams.flateMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap2 {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("nulla", "bulla", "chula");
		List<String> l2 = Arrays.asList("muri", "churi", "huri");

		List<List<String>> fn = new ArrayList<List<String>>();

		fn.add(l1);
		fn.add(l2);

		List<String> s1 = fn.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(s1);
	}

}
