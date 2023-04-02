package Streams.flateMap;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class AnyMatch_AllMatch {

	public static void main(String[] args) {
		Set<String> f = new HashSet<String>();
		f.add("one apple");
		f.add("one mango");
		f.add("two apple");
		f.add("two guavas");
		Set<String> f1 = new HashSet<String>();
		boolean r = f.stream().anyMatch(value -> {
			return value.startsWith("one");
		});
		System.out.println(r);

		List<String> s = f.stream().filter(e -> e.startsWith("one")).collect(Collectors.toList());
		System.out.println(s);

		boolean re = f.stream().allMatch(v -> {
			return v.startsWith("one");
		});
		System.out.println(re);

		boolean re1 = f.stream().noneMatch(v -> {
			return v.startsWith("Three");
		});
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''");
		System.out.println(re1);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Optional<String> s2 = f.stream().findAny();
		System.out.println(s2);
		System.out.println("###########################");
		Optional<String> s3 = f.stream().findFirst();
		System.out.println(s3);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		Optional<String> s4 = f1.stream().findAny();
		System.out.println(s4);
	}

}
