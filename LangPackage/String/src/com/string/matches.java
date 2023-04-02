package com.string;

public class matches {
public static void main(String[] args) {
	String s1="aaaabbbcdddeee";
	System.out.println(s1.matches("a*b*cd*e"));
	System.out.println(s1.matches("ab*cd*e"));
}
}
