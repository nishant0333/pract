package Streams.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullRemove {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("cup", null, "jal", "gal");
		List<String> newlist = list.stream().filter(l -> l != null).collect(Collectors.toList());
		System.out.println(newlist);
	}

}
