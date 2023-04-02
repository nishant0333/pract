package Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseDemo {
	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		List<String> vehiclesinUpper = new ArrayList<String>();
		vehiclesinUpper = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesinUpper);
	}

}
