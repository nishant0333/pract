package com.function;

import java.util.function.Function;
import java.util.function.Predicate;

class Student1 {
	String name;
	int marks;

	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class firstClass {

	public static void main(String[] args) {
		Function<Student1, String> f = s -> {
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
		Predicate<Student1> p = s -> s.marks >= 60;
		Student1[] s = { new Student1("mohan", 76), new Student1("ram", 98), new Student1("gita", 24) };
		for (Student1 s1 : s) {
			if (p.test(s1)) {
				System.out.println("Student name :" + s1.name);
				System.out.println("Student marks :" + s1.marks);
				System.out.println("student grde :" + f.apply(s1));
				System.out.println();

			}
		}

	}

}
