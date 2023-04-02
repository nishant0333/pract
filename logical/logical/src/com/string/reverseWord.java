	package com.string;

import java.util.stream.Stream;

public class reverseWord {

	public static void main(String[] args) {
		String s="my name is kalam";
		String s1[]=s.split(" ");
		String s4="";
		
		for(int i=(s1.length-1);i>=0;i--) {
			System.out.print(s1[i]);
			
			String s2=s1[i]+" ";
			
			char s3[]=s2.toCharArray();
			for(int j=(s3.length-1);j>=0;j--) {
				s4=s4+s3[j];
			}
			
		}
	
		
		System.out.println();
		System.out.print(s4);	
		
		
	}
	
}
