package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Numberfrequency {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3,4,5,6};
		HashMap<Integer,Integer> hi=new HashMap<>();
		for(Integer i:a) {
			
			if(hi.containsKey(i)) {
				hi.put(i,hi.get(i)+1);
			}else {
				hi.put(i,1);
			}
		}
		
Set<Map.Entry<Integer,Integer>> hs=hi.entrySet();
for(Map.Entry<Integer,Integer> s1:hs) {
	System.out.println(s1.getKey()+":"+s1.getValue());
}
	}

}
