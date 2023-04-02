package Streams.flateMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapMin_Max {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> min = li.stream().min((v1, v2) -> {
			return v1.compareTo(v2);
		});
		System.out.println("min value is :" + min.get());

		Optional<Integer> max = li.stream().max((v1, v2) -> {
			return v1.compareTo(v2);
		});
		System.out.println("max value is:" + max.get());

		Optional<Integer> reduce = li.stream().reduce((value, combinedvalue) -> {
			return combinedvalue + value;
		});
		System.out.println("_______________reduce__________");
		System.out.println(reduce.get());

		System.out.println("++++++++++++++to Array++++++++++++++");
		Object a[] = li.stream().toArray();
		for (Object o : a) {
			System.out.println(o);
		}
	}

}
