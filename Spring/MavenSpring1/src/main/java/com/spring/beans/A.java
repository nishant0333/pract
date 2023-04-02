package com.spring.beans;

public class A {
	 private int a;
     private String msg;
     
     
     public A() {
  	   System.out.println("def cons in A");
     }
      
     {
  	   System.out.println("ib in A");
     }
     static{
  	   System.out.println("sb in A");
     }
	public int getA() {
		System.out.println("get a in A");
		return a;
	}

	public void setA(int a) {
		System.out.println("set a in A");
		this.a = a;
	}

	public String getMsg() {
		System.out.println("get msg in A");
		return msg;
	}

	public void setMsg(String msg) {
		System.out.println("set msg in A");
		this.msg = msg;
	}
     
  public void show() {
	  System.out.println("show in A ");
	  System.out.println(a);
	  System.out.println(msg);
}
     
	
}
