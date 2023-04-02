package com.logical;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Emp {
	int id;
	String name;
	Double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> emp = Arrays.asList(new Emp(1, "Rahul", 10.50), new Emp(2, "Nishant", 8.50),
				new Emp(3, "Amresh", 20.8), new Emp(4, "Nishu", 15.50), new Emp(5, "Pankaj", 11.50),
				new Emp(6, "Rahul", 10.8));
		System.out.println(emp);
		for (Emp e : emp) {
			System.out.println(e);
		}
		System.out.println("-----------------------------------------------------");
		Comparator<Emp> com = (Emp e1, Emp e2) -> (e1.salary < e2.salary) ? 1 : (e1.salary > e2.salary) ? -1 : 0;
		Collections.sort(emp, com);
		System.out.println(emp);
		System.out.println("--------------------------------------------------------");
		for (Emp emp1 : emp) {
			System.out.println(emp1);
		}
		System.out.println("-----------------------------------------------------");
		Predicate<Emp> p = e -> e.salary >= 11.00;
		for (Emp employee : emp) {
			if (p.test(employee)) {
				System.out.println(employee.id + " : " + employee.name + " : " + employee.salary);
			}
		}
		System.out.println("-------------------------------------------------------");
		Function<Emp, Double> f = e1 -> e1.salary + 10.00;
		for (Emp emplo : emp) {
			// double d=f.apply(emplo);
			System.out.println(emplo.id + " : " + emplo.name + " : " + f.apply(emplo));
		}
	}

}
