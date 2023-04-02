package Streams.flateMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}

public class ParallelStream {

	public static void main(String[] args) {
		List<Student> s = Arrays.asList(new Student("ram", 90), new Student("Sita", 60), new Student("murli", 89));

		List<Student> l1 = s.stream().filter(e -> e.score >= 80).limit(2).collect(Collectors.toList());
		System.out.println(l1);
		List<Student> s2 = s.parallelStream().filter(w -> w.score >= 80).limit(2).collect(Collectors.toList());
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(s2);
	}

}
