package com.logical;

import java.util.*;

public class DupliHashMap1 {
	public static void main(String[] args) {
		int[] a = { 3, 5, 4, 3, 2, 2, 1, 3, 2, 2 };
		Map<Integer, Integer> hm = new HashMap<>();
		for (int no : a) {
//			Integer count = hm.get(no);
//			if (count == null) {
//				hm.put(no, 1);
//			} else {
//				count = count + 1;
//				hm.put(no, count);
//			
//			}
			if(hm.containsKey(no)) {
				hm.put(no, hm.get(no)+1);
			}else {
				hm.put(no,1);
			}
		}
		System.out.println("Dublicate elements are :");
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for (Map.Entry<Integer, Integer> me : es) {
			if (me.getValue() > 0) {
				System.out.println(me.getKey() + " "+ me.getValue());

			}

		}
	}
}
