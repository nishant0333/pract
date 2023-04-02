package Biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}
}

public class SalaryIncrement {

	public static void main(String[] args) {
		BiConsumer<Employee, Double> c = (e, d) -> e.salary = e.salary + d;
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("Durga", 1000));
		l.add(new Employee("ram", 2000));
		l.add(new Employee("Sita", 3000));
		l.add(new Employee("mohan", 4000));
		l.add(new Employee("sohan", 5000));

		for (Employee e : l) {
			c.accept(e, 200.0);
		}
		for (Employee e : l) {
			System.out.println("Employee name :" + e.name);
			System.out.println("Employee salary :" + e.salary);
			System.out.println();
		}

	}

}
