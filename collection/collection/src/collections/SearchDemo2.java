package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}

}

public class SearchDemo2 {

	public static void main(String[] args) {
		MyComparator c2 = new MyComparator();
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println("Before sort" + l);
		Collections.sort(l, c2);
		System.out.println("After sort" + l);
		// System.out.println("Desired output : " + Collections.binarySearch(l, "a",
		// c2));
		// Collections.reverse(l);
		// System.out.println(l);
		Comparator c1 = Collections.reverseOrder(c2);
		Collections.sort(l, c1);
		System.out.println(l);
		// System.out.println("Desired output : " + Collections.binarySearch(l, "a5",
		// c1));

	}

}
