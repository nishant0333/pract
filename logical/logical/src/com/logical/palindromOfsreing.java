package com.logical;

public class palindromOfsreing {

	public static void main(String[] args) {

		String s = "apa";
		char[] ch = s.toCharArray();
		String s2 = "";
		for (int i = (ch.length-1); i >= 0; i--) {
			s2 = s2 + ch[i];
		}
		System.out.println(s);
		System.out.println();
		System.out.println("Reverse of string :"+s2);
		System.out.println();
		
		if(s.equals(s2)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
