package java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 {
	String name;
	int eno;

	Employee1(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}

	public String toString() {
		return name + ":" + eno;
	}

}

public class EmployeeOnAccendingOnEmployeeName {

	public static void main(String[] args) {
		ArrayList<Employee1> l = new ArrayList<Employee1>();
		l.add(new Employee1("Durga", 872425));
		l.add(new Employee1("sunny", 2123345));
		l.add(new Employee1("Bunny", 1112113));
		l.add(new Employee1("Chinny", 434343));
		l.add(new Employee1("Vinny", 424345));
		System.out.println(l);
		Collections.sort(l, (e1, e2) -> e1.name.compareTo(e2.name));
		System.out.println(l);

	}

}
