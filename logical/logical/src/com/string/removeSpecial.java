package com.string;

public class removeSpecial {

	public static void main(String[] args) {
		String s="nishant123@234*$#";
		
		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);

	}

}
