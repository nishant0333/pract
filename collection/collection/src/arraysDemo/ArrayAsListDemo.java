package arraysDemo;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		String[] s = { "A", "Z", "B" };

		int a[] = { 1, 2, 3, 4, 5 };
		List<int[]> list = Arrays.asList(a);
		for (int[] al : list) {
			for (int ab : al) {
				System.out.println(ab);
			}
		}

		List<String> l = Arrays.asList(s);
		ListIterator<String> le = l.listIterator();
		while (le.hasNext()) {
			String s1 = (String) le.next();
			System.out.println(s1);
		}

		for (Object s2 : l) {
			System.out.println(s2);
		}
		System.out.println(l);
	}

}
