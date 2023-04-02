package Bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
	int eno;
	String name;

	public Employee(int eno, String name) {
		this.eno = eno;
		this.name = name;

	}
}

public class EmployeeObject {

	public static void main(String[] args) {
		BiFunction<Integer, String, Employee> f = (eno, name) -> new Employee(eno, name);
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(f.apply(101, "Sully"));
		l.add(f.apply(102, "gully"));
		l.add(f.apply(103, "billy"));
		l.add(f.apply(104, "murgan"));
		l.add(f.apply(105, "lurgan"));

		for (Employee e : l) {
			System.out.println("Employee number : " + e.eno);
			System.out.println("Employee name :" + e.name);
			System.out.println();

		}

	}

}
