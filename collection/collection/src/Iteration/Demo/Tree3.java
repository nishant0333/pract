package Iteration.Demo;

import java.util.HashSet;
import java.util.TreeSet;

public class Tree3 {
	public static void main(String[] args) {
		TreeSet<Object> t = new TreeSet<Object>();
		t.add("ram");
		t.add("mohan");
		t.add("mohini");
		t.add("manoj");
		// t.add(null);
		HashSet<Object> hs = new HashSet<Object>(t);
		System.out.println(hs);
		hs.add(1);
		System.out.println(hs);
	}
}
