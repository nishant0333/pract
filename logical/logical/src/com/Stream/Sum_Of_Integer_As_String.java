package com.Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Sum_Of_Integer_As_String {
public static void main(String[] args) {
		
		
		List<String> l=new ArrayList<>();
		
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		
	ArrayList<Integer> il=new ArrayList<>();

	Iterator itr = l.iterator();

	while(itr.hasNext()) {
		
		int int1 = Integer.parseInt((String) itr.next());
		il.add(int1);
	}
		
	Integer sum = il.stream().collect(Collectors.summingInt(e->e));

	System.out.println(sum);
	}
}
