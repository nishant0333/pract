package Streams.flateMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap1 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
		List l2 = Arrays.asList(6, 7);
		List l3 = Arrays.asList(8, 9, 10);

		List<List<Integer>> fl = Arrays.asList(l1, l2, l3);

		// List<Integer> f = fl.stream().flatMap(x ->
		// x.stream()).collect(Collectors.toList());
		// System.out.println(f);

		List<Integer> fn = fl.stream().flatMap(x -> x.stream().map(n -> n + 10)).collect(Collectors.toList());
		System.out.println(fn);
	}

}
