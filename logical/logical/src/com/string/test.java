package com.string;

public class test {

	public static void main(String[] args) {
		String s1 = "my name is #key1# and iam from #key2#";
		String str = "";
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '#') {
				for (int j = i + 1; j < s1.length(); j++) {
					if (s1.charAt(j) == '#') {
						break;
					}
					str = str + s1.charAt(j);
					count++;
					i = j+1;
				}

			}
			if(count!=0)
			System.out.println(str);
			count=0;
			str="";
		}

	}

}
