package Iteration.Demo;

import java.util.HashSet;

public class HashsetIteration {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("ram");
		h.add("mohan");
		h.add("soham");
		h.add("mohini");
		h.add("kamli");
		System.out.println(h);
//		Iterator<String> i = h.iterator();
//		while (i.hasNext()) {
//			String s1 = (String) i.next();
//			System.out.println(s1);
//		}
		for (String s2 : h) {
			System.out.println(s2);
		}

	}

}
