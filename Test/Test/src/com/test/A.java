package com.test;

public interface A {
public void m1();
public void m1(int a);
}
class B implements A{

	@Override
	public void m1() {
		System.out.println("m1 in class B");	
	}
	public void m1(int a) {
		System.out.println("m1(int a) in class B");	
	}
	

}