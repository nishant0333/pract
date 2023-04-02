package MapIteration;

import java.util.Comparator;
import java.util.TreeMap;

class mycomparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);

	}

}

public class TreeMapComparator {

	public static void main(String[] args) {
		TreeMap t = new TreeMap<>(new mycomparator());
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		System.out.println(t);
	}

}
