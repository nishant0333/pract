package Iteration.Demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIteration {

	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		t.add("ram");
		t.add("mohan");
		t.add("mohini");
		t.add("manoj");
		System.out.println(t);
		Iterator<String> itr = t.iterator();
		while (itr.hasNext()) {
			String s1 = (String) itr.next();
			System.out.println(s1);

		}

	}

}
