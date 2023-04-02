package com.test;
class Hello{
	void m1(byte b1) {
		System.out.println("m1(byte b1)in hello");
	}
	void m1(short s) {
		System.out.println("m1(short s)in hello");
	}
	void m1(double d) {
		System.out.println("m1(doble d )in hello");
		
	}
	void m1(long l) {
		System.out.println("m1(long) in hello");
	}
	void m1(char c) {
		System.out.println("m1(char)in hello");
		}
//	void m1(int i) {
//		System.out.println("m1(int i)in hello");
//		
//	}
}
public class higher_compatable_dataType {

	public static void main(String[] args) {
		Hello h1=new Hello();
		h1.m1(1110);

	}

}
