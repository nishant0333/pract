package com.test;
class Hell{
	{
		System.out.println("IB in Hello");
	}
	static{
		System.out.println("SB in HELLO");
	}
	void m1() {
		System.out.println("m1 in hello");
	}
	static void m2() {
		System.out.println("static m2 in hello");
	}
	
}
public class Static_object {
Hell h1=new Hell();
static Static_object sO=new Static_object();
{
System.out.println("IB in Static_object");	
Hell h2=new Hell();
h1.m1();
h2.m1();
}
{
System.out.println("SB in Static_object");	
}
	public static void main(String[] args) {
		
System.out.println("main in Static_object");
Hell.m2();
	}

}
