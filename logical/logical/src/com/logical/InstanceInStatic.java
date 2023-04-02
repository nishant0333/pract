package com.logical;
class Hello{
	int a=10;
	static int b=20;
	void m1() {
		System.out.println("m1 in Hello");
	}
	static void m22(Hello h1) {
		System.out.println("m22 in hello");
		System.out.println(h1.a);
		h1.m1();
	}
}
public class InstanceInStatic {

	public static void main(String[] args) {
		//Hello.m22(null);
		Hello.m22(new Hello());
		

	}

}
