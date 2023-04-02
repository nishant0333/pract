package com.string;

import java.util.Arrays;

public class findAnagram {
	public static void main(String[] args) {

		String s1="apple";
		String s2="elppa";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int n1=ch1.length;
		int n2=ch2.length;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=false;
		
		if(n1!=n2) {
			flag=false;
		}
	for(int i=0;i<n1;i++) {
		if(ch1[i]!=ch2[i]) {
			flag=false;
			break;
		}else {
			flag=true;
		}
		
	}
	System.out.println(flag);
	if(flag==true) {
		System.out.println("anagram");
		}
	if(flag==false) {
		System.out.println("not anagram");
	}
	}
}
