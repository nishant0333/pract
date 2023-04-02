package com.logical;
final class A{
private int i;
A(int i){
	this.i=i;
}
public A m1(int i) {
	if(this.i==i) {
		return this;
	}else {
		return (new A(i));
	}
}
}
public class immutableA {

	public static void main(String[] args) {
		A a1=new A(10);
		A a2=a1.m1(10);
		A a3=a1.m1(100);
System.out.println(a1==a2);
System.out.println(a1==a3);
	}

}
