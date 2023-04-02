package Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
	int empid;
	String name;
	int salary;

	public Employee1(int empid, String name, int salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Demo_filter_map_employee {
	public static void main(String[] args) {
		List<Employee1> emp = Arrays.asList(new Employee1(101, "Alex", 10000), new Employee1(102, "Brain", 20000),
				new Employee1(103, "charles", 30000), new Employee1(104, "david", 40000),
				new Employee1(105, "Edward", 50000));

		List<Employee1> e1 = emp.stream().filter(e -> e.salary > 20000).map(e -> e).collect(Collectors.toList());
		System.out.println(e1);

		for (Employee1 e2 : emp) {
			System.out.println(e2.empid + " : " + e2.name + " : " + e2.salary);
		}
	}
}
