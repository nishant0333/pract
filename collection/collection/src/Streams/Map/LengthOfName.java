package Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfName {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		List<Integer> i = new ArrayList<Integer>();
		i = vehicles.stream().map(name -> name.length()).collect(Collectors.toList());

		for (Integer integer : i) {
			System.out.println(integer);
		}

	}

}
