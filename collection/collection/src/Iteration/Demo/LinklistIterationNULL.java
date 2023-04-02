package Iteration.Demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistIterationNULL {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("ram");
		l.add(null);
		l.add("sita");
		Iterator<String> s = l.iterator();
		while (s.hasNext()) {
			String s1 = (String) s.next();
			// System.out.println(s1);
			if (s1.startsWith("r")) {
				System.out.println(s1);
			}
		}
	}
}
