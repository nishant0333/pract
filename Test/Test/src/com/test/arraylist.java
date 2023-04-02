package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

public static void main(String[] args) {
	ArrayList list=new ArrayList();
	list.add("ram");
	list.add("amresh");
	list.add("sohan");
	list.add("Amit");
	list.add("Ashish");
	System.out.println(list);
	Iterator itr =list.iterator();
	while (itr.hasNext()) {
		{
			String string=(String) itr.next();
			System.out.println(string);	
		}
	}
	ArrayList l2=new ArrayList();
	boolean b=l2.addAll(list);
	
	System.out.println(l2);
	System.out.println(b);
	Object o1=l2.get(0);
	System.out.println(o1);
	Object o2=l2.remove(2);
	System.out.println(o2);
	System.out.println(l2);
	Object o3=l2.set(2,"nishant");
	System.out.println(o3);
	System.out.println(l2);
	int i1=l2.indexOf("nishant");
	System.out.println(i1);
	ListIterator ltr =l2.listIterator();
	while (ltr.hasNext()) {
		String str=(String) ltr.next();
		System.out.println(str);
		if (str.equals("nishant")) {
			ltr.remove();
		}
		else if (str.equals("ram")) {
			ltr.set("Amit");
		}
//		else if (str.equals("ram")) {
//			ltr.set("mohan");
//		}
	}
	
	System.out.println(l2);
	
	
}
}
