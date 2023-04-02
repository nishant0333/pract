package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		// l.add(null);
		// l.add(1);
		// l.add('a');

		System.out.println("Array list Before sortig" + l);
		Collections.sort(l);
		System.out.println("After sorting" + l);

	}

}
