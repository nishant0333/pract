package Iteration.Demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteration {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("ram");
		l.add("shyam");
		l.add("radha");
		l.add("gita");
		l.add("sita");
		System.out.println(l);
		System.out.println("''''''''''''''''''''''''''''");
//		Iterator itr = l.iterator();
//		while (itr.hasNext()) {
//			String s = (String) itr.next();
////			if (!s.endsWith("a")) {
////				System.out.println(s);
////			}
//			if (s.startsWith("s")) {
//				System.out.println(s);
//			}
//		}
		ListIterator<String> ls = l.listIterator();
		while (ls.hasNext()) {
			String s1 = (String) ls.next();
			System.out.println(s1);
		}
		System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
		while (ls.hasPrevious()) {
			String s2 = (String) ls.previous();
			System.out.println(s2);
		}

	}
}
