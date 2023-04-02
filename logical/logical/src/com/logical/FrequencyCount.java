package com.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyCount {

	public static void main(String[] args) {
		String str="abcdabcaba";
		char ch[]=str.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<Character,Integer>();
		for(Character ch1:ch) {
			if(map.containsKey(ch1)) {
				map.put(ch1,map.get(ch1)+1);
			}else {
				map.put(ch1, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		for(Entry<Character, Integer> fr:set) {
			if(fr.getValue()>1) {
				System.out.println(fr.getKey()+" : "+fr.getValue());
			}
		}

	}

}
