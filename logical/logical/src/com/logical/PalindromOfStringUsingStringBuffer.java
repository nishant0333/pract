package com.logical;

public class PalindromOfStringUsingStringBuffer {
	public static void main(String[] args) {
		String s1 = "ana";
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		String s2=sb1.toString();
		if(s2.equals(s1)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrom");
		}
		
	}
}
