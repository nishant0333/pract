package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateinArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("A");
		a.add("A");
		a.add("B");

		HashSet<String> hs = new HashSet<>(a);
		System.out.println(hs);

	}

}
