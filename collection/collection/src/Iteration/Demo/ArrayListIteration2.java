package Iteration.Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration2 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(101);
		l.add(12);
		l.add(11);
		l.add(23);
		l.add(34);
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();

			if (i % 2 == 0) {

				System.out.println(i);
			}
		}
	}
}
