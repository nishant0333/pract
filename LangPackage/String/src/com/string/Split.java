package com.string;

public class Split {
public static void main(String[] args) {
	String str="Hi I am in java training center for java classes";
	String s2[]=str.split("java");
	for(int i=0;i<s2.length;i++) {
		
		System.out.println(s2[i]);
	}
	System.out.println(s2.length);
}
}
