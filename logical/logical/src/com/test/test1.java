package com.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class A{
	
	int a=10;
	static int b=21;
	public static void m1() {
		int d=31;
		
		System.out.println("m1 in A");
		System.out.println(d);
	}
}

public class test1 extends A{

	public static void main(String... args) {
	test1 t=new test1();
	System.out.println(t.a);
	System.out.println(t.b);
	t.m1();

	}

	
	
}
