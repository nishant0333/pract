package com.logical;

public class ReverseString {

	public static void main(String[] args) {

		String s = "pankaj";
		char[] ch = s.toCharArray();
		String s2 = "";
		for (int i = (ch.length-1); i >= 0; i--) {
			s2 = s2 + ch[i];
		}
		System.out.println(s);
		System.out.println("Reverse of string :"+s2);
	}

}
