package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomparator11 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;

		return s2.compareTo(s1);
	}

}

public class SortDemo2 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println("Before sorting" + l);
		Collections.sort(l, new Mycomparator11());
		System.out.println("After sorting " + l);

	}

}
