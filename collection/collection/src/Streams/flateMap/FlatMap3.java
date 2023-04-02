package Streams.flateMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap3 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(12);
		l1.add(14);
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(21);
		l2.add(22);
		l2.add(23);
		l2.add(21);
		l2.add(23);
		l2.add(25);

		List<List<Integer>> fl = new ArrayList<List<Integer>>();
		fl.add(l1);
		fl.add(l2);

		List<Integer> nl = fl.stream().flatMap(x -> x.stream()).map(m -> m + 1).filter(n -> n % 2 == 0).distinct()
				.collect(Collectors.toList());
		long count = nl.stream().limit(2).count();
		System.out.println(nl);
		System.out.println(count);
	}

}
