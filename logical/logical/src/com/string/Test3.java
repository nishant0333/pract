package com.string;

public class Test3 {

	public static void main(String[] args) {
	String s1="i am legend ";
	String s[]=s1.split(" ");
	for(String s2:s) {
if (s2.startsWith("am")) {
System.out.println(s2);	
}
}
		
	}

}
