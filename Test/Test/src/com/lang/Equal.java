package com.lang;

class A {
	int a;

	public A(int a) {
		// TODO Auto-generated constructor stub
		this.a = a;
	}

	public boolean equals(Object object) {
		A s = (A) object;
		if (s.a == this.a) {
			return true;
		} else {
			return false;
		}
	}
}

public class Equal {
	public static void main(String[] args) {
		A a1 = new A(10);
		A a2 = new A(10);
		System.out.println(a1.equals(a2));
	}

}
