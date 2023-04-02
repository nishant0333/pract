package Iteration.Demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistIteration1 {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(1);
		l.add("ram");
		l.add(112);
		l.add("mohan");
		Iterator<Object> it = l.iterator();
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);

		}

	}

}
