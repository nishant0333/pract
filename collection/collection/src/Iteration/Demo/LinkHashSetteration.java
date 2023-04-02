package Iteration.Demo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetteration {

	public static void main(String[] args) {
		LinkedHashSet<String> l = new LinkedHashSet<String>();
		l.add("Hero");
		l.add("Zero");
		l.add("siro");
		System.out.println(l);
		Iterator<String> r = l.iterator();
		while (r.hasNext()) {
			String S3 = r.next();
			System.out.println(S3);
		}
	}

}
