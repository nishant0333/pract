package com.spring.beans;

public class B {
	

	private int b;
     private String str;
     
     
//     default const...
     public B() {
  	   System.out.println("def cons in B");
     }
     {
    	 System.out.println("ib in B");
     }
     static {
    	 System.out.println("sb in B");
     }
     
     //2-para cons
	
	
	// setter and getter
	 public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	public String getStr() {
		return str;
	}



	public void setStr(String str) {
		this.str = str;
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
