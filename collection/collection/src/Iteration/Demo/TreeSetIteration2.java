package Iteration.Demo;

import java.util.Comparator;
import java.util.TreeSet;

class Mycompaparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o2.compareTo(o1);
	}

}

public class TreeSetIteration2 {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new Mycompaparator());
		t.add("mohan");
		t.add("ram");
		t.add("hana");
		t.add("nirwana");
		System.out.println(t);

	}

}
