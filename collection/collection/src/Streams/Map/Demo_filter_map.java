package Streams.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empid;
	String name;
	int salary;

	public Employee(int empid, String name, int salary) {
		this.empid = empid;
		this.empid = empid;
		this.salary = salary;

	}

}

public class Demo_filter_map {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(101, "Alex", 10000), new Employee(102, "Brain", 20000),
				new Employee(103, "charles", 30000), new Employee(104, "david", 40000),
				new Employee(105, "Edward", 50000));
		List<Integer> le = new ArrayList<Integer>();
		le = emp.stream().filter(e -> e.salary > 20000).map(e -> e.salary).collect(Collectors.toList());
		System.out.println(le);
	}
}
