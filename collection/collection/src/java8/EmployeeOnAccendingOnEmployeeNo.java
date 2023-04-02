package java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	String name;
	int eno;

	Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return name + ":" + eno;
	}

}

public class EmployeeOnAccendingOnEmployeeNo {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Durga", 872425));
		l.add(new Employee("sunny", 2123345));
		l.add(new Employee("Bunny", 1112113));
		l.add(new Employee("Chinny", 434343));
		l.add(new Employee("Vinny", 424345));
		System.out.println(l);
		Collections.sort(l, (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0);
		System.out.println(l);
	}

}
