package Iteration.Demo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIteration {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>();
		v.add(1);
		v.add(12);
		v.add("ram");
		v.add("mohan");
//		Iterator<Object> itr = v.iterator();
//		while (itr.hasNext()) {
//			Object o = (Object) itr.next();
//			System.out.println(o);
//		}

//		for (Object o : v) {
//			System.out.println(o);
//		}

		Enumeration<Object> e = v.elements();
		while (e.hasMoreElements()) {
			Object o1 = (Object) e.nextElement();
			System.out.println(o1);
		}
	}
}
