package com.string;

import java.util.stream.Stream;

public class reverseWord1 {

	public static void main(String[] args) {
		String s="my name is kalam";
		String[] s1 = s.split(" ");
		String s2="";
		for(int i=(s1.length-1);i>=0;i--) {
			
			
			 s2=s2+s1[i]+" ";
		}
		
		Stream.of(s2).forEach(System.out::print);
	}

}
