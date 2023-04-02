package com.string;

import java.util.HashMap;

public class StringFriquency {
	
	
public static void getfrequency(String s) {
	HashMap<Character,Integer> hs=new HashMap<>();
	char c[]=s.toCharArray();
	for(char ch:c) {
		if(hs.containsKey(ch)) {
			hs.put(ch,hs.get(ch)+1);
		}
		else {
			hs.put(ch,1);
		}
		
	}
	System.out.println(s+":"+hs);
}
	public static void main(String[] args) {
		getfrequency("test");

	}

}
