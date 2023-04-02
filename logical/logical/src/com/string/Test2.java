package com.string;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I am #key1# and i am from #key2#";
		String s[]=str.split("#");
		for(String s1:s) {
			if(s1.startsWith("key")) {
				System.out.println(s1);
			}
		}

	}

}
