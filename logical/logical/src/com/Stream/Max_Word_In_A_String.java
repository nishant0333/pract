package com.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Max_Word_In_A_String {
public static void main(String[] args) {
		
		String s="ram mohan nishant";
		
		String[] split = s.split(" ");
		
		Comparator<String> c =(c1,c2) -> {
			Integer l1 = c1.length();
			Integer l2 = c2.length();
			
			if(l1<l2)  return -1;
			if(l1>l2)  return 1;
			else return 0;
		};
		
		
System.out.println("---------------by direct Array with the help of Stream.of()---------------");
		
		Optional<String> max2 = Stream.of(split).max(c);		
		System.out.println(max2.get());
			
		System.out.println("---------------by list and stream---------------");
		
		ArrayList<String> list2 = new ArrayList<>();
		for(String s2:split) {
		list2.add(s2);
		}
		
		Optional<String> max = list2.stream().max(c);
		System.out.println(max.get());
		
		
		 
	}
}