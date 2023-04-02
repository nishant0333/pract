package com.string;

public class SplitOnWildCharacter {

	public static void main(String[] args) {
		String s1="Hi, help. How are you? bye! ok";
		String s2 []=s1.split("[\\,.?!]");
		for (int i=0;i<s2.length;i++) {
			System.out.println(s2[i]);
		}
//		for(String s3:s2) {
//			System.out.println(s3);
//		}

	}

}
