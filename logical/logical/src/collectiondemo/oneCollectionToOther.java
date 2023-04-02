package collectiondemo;

import java.util.*;

public class oneCollectionToOther {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1);
		l.add("a");
		l.add('a');
		l.add(2);
		
		ArrayList l1=new ArrayList();
		l1.addAll(l);
		System.out.println(l1);
		
		System.out.println("Add ArrayList to LinkList");
		
		LinkedList ln=new LinkedList();
		ln.addAll(l);
		System.out.println(ln);
		System.out.println("Add on specific index");
		
		LinkedList ln1=new LinkedList();
		ln1.add(4);
		ln1.add(2);
		ln1.add(5);
		ln1.add(1,7);
		System.out.println(ln1);
		ln1.addAll(1,l);
		System.out.println(ln1);
		
		HashSet s=new HashSet<>();
		s.addAll(l);
		System.out.println(s);
		List<Integer> list=Arrays.asList(1,2,7,3,4,5,6,9,8);
		System.out.println("first way one collection to other");
		TreeSet t=new TreeSet();
		t.addAll(list);
		System.out.println(t);
		System.out.println("second way");
		TreeSet t1=new TreeSet(list);
		System.out.println(t1);
		System.out.println("Third way");
		TreeSet t2=new TreeSet<>();
		for(Integer i:list) {
			t2.add(i);
		}
		System.out.println(t2);
	}
}
