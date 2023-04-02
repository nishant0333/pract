package Iteration.Demo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class mecomparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 1;
	}

}

public class DuplicateInHashmap {

	public static void main(String[] args) {
		TreeSet<Object> t1 = new TreeSet<Object>(new mecomparator());
		t1.add("re");
		t1.add("we");
		t1.add("qw");
		t1.add("ui");
		t1.add("re");
		t1.add("1");
		System.out.println(t1);
		HashSet<Object> hs = new HashSet<Object>(t1);
		hs.add("re");
		hs.add("1");
		System.out.println(hs);
		for (Object obj : hs) {
			System.out.println(obj);
		}
	}

}
