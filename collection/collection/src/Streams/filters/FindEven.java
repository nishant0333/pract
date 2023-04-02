package Streams.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEven {

	public static void main(String[] args) {

		List<Integer> numberlist = Arrays.asList(10, 15, 20, 25, 30);
		List<Integer> evennumber = new ArrayList<Integer>();

		evennumber = numberlist.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evennumber);

	}

}
