package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Jtc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(99);
		System.out.println(hs.add("som"));
		hs.add("som@jtc");
		System.out.println(hs.add("som"));
		System.out.println(hs);
		TreeSet ts=new TreeSet();
		//ts.add(new Integer(99));
		System.out.println(ts.add("som"));
		ts.add("som@jtc");
		ts.add("som");
		ts.add("aaa");
		ts.add("cccc");
		ts.add("bbb");
		System.out.println(ts);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(99);
		System.out.println(lhs.add("som"));
		lhs.add("som@jtc");
		System.out.println(lhs.add("som"));
		System.out.println(lhs);

	}

}
