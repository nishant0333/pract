package Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class multi {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(2, 3, 4, 5, 6, 7);
		List<Integer> l2 = new ArrayList<Integer>();
		l2 = l1.stream().map(l -> l * 3).collect(Collectors.toList());
		System.out.println(l2);
		for (Integer integer : l2) {
			System.out.println(integer);
		}
	}
}
