package com.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class freq {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,5,6,2,3};
		
HashMap<Integer,Integer> hs=new HashMap<>();

for(int s:a) {
	if(hs.containsKey(s)) {
		hs.put(s,hs.get(s)+1);
	}
	else {
		hs.put(s,1);
	}
}
System.out.println(hs);
//Set<Entry<Integer,Integer>> es=hs.entrySet();
//for(Map.Entry<Integer,Integer> s2:es) {
//	System.out.println(s2.getKey()+" : "+s2.getValue());
//	
	ArrayList<Integer>al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
//	for(int i:al) {
//		System.out.println(i);
//	}
	Iterator<Integer>itr=al.iterator();
	while (itr.hasNext()) {
		Integer I1=(Integer)itr.next();
		System.out.println(I1);
	}
}
	}


