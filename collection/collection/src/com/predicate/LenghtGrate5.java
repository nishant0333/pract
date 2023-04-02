package com.predicate;

import java.util.function.Predicate;

public class LenghtGrate5 {

	public static void main(String[] args) {
		Predicate<String> p = s -> s.length() > 5;
		String[] str = { "nag", "chiru", "chiranjeevi", "venkatesh", "Balaiah" };
		for (String s1 : str) {
			System.out.println(p.test(s1));
		}
	}

}
