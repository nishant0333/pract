package com.test;

public class Test {
static  int i;
public Test() {
	i=30;
}
public Test(int i) {
	// TODO Auto-generated constructor stub
this.i=i;
}
void m1(){
	System.out.println(i);
{
i=20;	
}
System.out.println(i);
}	
	public static void main(String[] args) {
	System.out.println(Test.i);
	Test t=new Test(40);
	t.m1();
	Test t1=new Test();
//	t.m1();
	t1.m1();
System.out.println(Test.i);

}
}
