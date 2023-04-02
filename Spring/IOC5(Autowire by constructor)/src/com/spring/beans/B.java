package com.spring.beans;

public class B {
	 private int b;
     private String str;
     
     public B() {
  	   System.out.println("def cons in B");
     }
     
	public B(int b, String str) {
		System.out.println("2- parameterized cons in B");
		this.b=b;
		this.str=str;
	}
	
	@Override
	public String toString() {
		return "B [b=" + b + ", str=" + str + "]";
	}
     
	 public void showB() {
		  System.out.println("show in b ");
		  System.out.println(b);
		  System.out.println(str);
	  }	 
}
