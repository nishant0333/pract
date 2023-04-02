package Iteration.Demo;

import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}

}

public class Tree4 {
	public static void main(String[] args) {

		TreeSet t = new TreeSet(new myComparator());
		t.add("A");
		t.add("B");
		t.add("C");
		System.out.println(t);
	}
}
