package com.string;

public class Split1 {
public static void main(String[] args) {
	String s1=" Hi, help. How are you? Bye! ok";
	//String s2[]=s1.split("[,.?!]");
	String s2[]=s1.split(",.?!");
	for (int i=0;i<s2.length;i++) {
		System.out.println(s2[i]);
		//System.out.println(s2[i].trim());
	}
}
}
