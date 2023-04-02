package Iteration.Demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class haloa {
	String name;
	int salary;

	public haloa(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

class mycomparator1 implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		haloa e1 = (haloa) o1;
		haloa e2 = (haloa) o2;
		Integer I1 = e1.salary;
		Integer I2 = e2.salary;
		return I2.compareTo(I1);
	}
}

public class TreeComparator {

	public static void main(String[] args) {
		TreeSet<haloa> t = new TreeSet<haloa>(new mycomparator1());
		t.add(new haloa("A", 10000));
		t.add(new haloa("X", 2000));
		t.add(new haloa("N", 3000));
		t.add(new haloa("m", 4000));
		t.add(new haloa("r", 5000));
		Iterator<haloa> itr = t.iterator();
		while (itr.hasNext()) {
			haloa el = (haloa) itr.next();
			System.out.println("name :" + el.name + ":" + "salary :" + el.salary);
		}
	}

}
