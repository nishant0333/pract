package com.function;

import java.util.function.Function;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class Grade {

	public static void main(String[] args) {
		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = " ";
			if (marks >= 80)
				grade = "A[Dictinction]";
			else if (marks >= 60)
				grade = "B[first class]";
			else if (marks >= 50)
				grade = "C[second class]";
			else if (marks >= 35)
				grade = "D[pass]";
			else
				grade = "fail";
			return grade;
		};
		Student[] s = { new Student("Durga", 100), new Student("sunny", 65), new Student("Bunny", 55),
				new Student("chiny", 45), new Student("viny", 25) };
		for (Student s1 : s) {
			System.out.println("student name:" + s1.name);
			System.out.println("student marks:" + s1.marks);
			System.out.println("student grade:" + f.apply(s1));
			System.out.println();

		}
	}

}
