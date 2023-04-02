package com.consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student2 {
	String name;
	int marks;

	public Student2(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

}

public class studentGrade {

	public static void main(String[] args) {
		Function<Student2, String> f = s -> {
			int marks = s.marks;
			String grade = " ";
			if (marks >= 80)
				grade = "A";
			else if (marks >= 60)
				grade = "B";
			else if (marks >= 50)
				grade = "C";
			else if (marks >= 35)
				grade = "D";
			else
				grade = "E";
			return grade;
		};
		Predicate<Student2> p = s -> s.marks >= 60;

		Consumer<Student2> c = s -> {
			System.out.println("student name :" + s.name);
			System.out.println("student marks :" + s.marks);
			System.out.println("student grade :" + f.apply(s));
			System.out.println();
		};
		Student2[] st = { new Student2("chini", 98), new Student2("Binny", 68), new Student2("funny", 45),
				new Student2("Ghunny", 24), new Student2("hunhunny", 100) };
		for (Student2 s2 : st) {
			if (p.test(s2)) {
				c.accept(s2);
			}
		}

	}

}
