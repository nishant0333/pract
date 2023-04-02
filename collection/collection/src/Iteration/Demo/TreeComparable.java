package Iteration.Demo;

import java.util.TreeSet;

class emp1 implements Comparable<Object> {
	String name;
	int salary;

	public emp1() {

	}

	public emp1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "emp [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		int salary1 = this.salary;
		emp1 e = (emp1) o;
		int salary2 = e.salary;
		if (salary1 < salary2) {
			return -1;
		} else if (salary1 > salary2) {
			return 1;

		} else
			return 0;

	}
}

public class TreeComparable {

	public static void main(String[] args) {
		TreeSet<emp1> t = new TreeSet<emp1>();
		t.add(new emp1("ram", 1000));
		t.add(new emp1("mohan", 2000));
		t.add(new emp1("shyam", 3000));
		t.add(new emp1("sohan", 4000));
		t.add(new emp1("rohan", 5000));
		for (emp1 e2 : t) {
			System.out.println("name :" + e2.name + ":" + e2.salary);
		}
	}

}
