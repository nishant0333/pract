package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;
public class HashmapSum {
public static void main(String[] args) {
	
	
	
	HashMap<String,Integer> e=new HashMap<>();
	e.put("ram",100);
	e.put("mohan",200);
	e.put("sita",300);
	e.put("gita",400);
	
	Set<Entry<String, Integer>> s=e.entrySet();
	Iterator<Entry<String, Integer>> itr=s.iterator();
	int a=0;
	while(itr.hasNext()) {
		Map.Entry<String,Integer> s1=(Map.Entry<String,Integer>)itr.next();
		System.out.println(s1);
		Integer i1=(Integer)s1.getValue();
		a=a+i1;
		
	}
	System.out.println("Sum of all employee salary :"+a);
	
	
}
}
