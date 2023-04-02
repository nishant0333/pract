package com.string;

public class vowel_consonentInArray {
	public static void main(String args[]) {
		String s = "annavegai";
		int count1 = 0;
		int count2 = 0;
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				count1++;
			} else {

				count2++;
			}
		}

		Character[] st1 = new Character[count1];
		int m = 0;
		Character[] st2 = new Character[count2];
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				st1[m] = s.charAt(i);
				m++;
			} else {
				st2[n] = s.charAt(i);
				n++;
			}
		}
		System.out.print("vowel :");
		for (Character c : st1) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.print("consonent :");
		for (Character c1 : st2) {
			System.out.print(c1 + " ");
		}
	}
}
