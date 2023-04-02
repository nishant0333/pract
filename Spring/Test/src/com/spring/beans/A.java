package com.spring.beans;

public class A {
	 private int a;
     private String msg;
     
     
     public A() {
  	   System.out.println("def cons in A");
     }     
	
     public A(int a,String msg) {
    	 System.out.println("2- parameterized cons in A");
    	 this.a=a;
    	 this.msg=msg;
     }
     
     @Override
     public String toString() {
     	return "A [a=" + a + ", msg=" + msg + "]";
     }  
     
  public void show() {
	  System.out.println("show in A ");
	  System.out.println(a);
	  System.out.println(msg);
}	
}
