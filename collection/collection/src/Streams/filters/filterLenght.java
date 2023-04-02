package Streams.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterLenght {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("mohanna", "sohanna", "rohan", "sita", "Gita");

		List<String> newname = new ArrayList<String>();

		newname = name.stream().filter(s -> s.length() > 6 && s.length() < 8).collect(Collectors.toList());
		System.out.println(newname);
	}

}
