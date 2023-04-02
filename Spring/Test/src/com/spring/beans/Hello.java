package com.spring.beans;

public class Hello {
	 private A aobj;
     private B bobj;
     Hello(){
    	 System.out.println("def cons in Hello()");
     }
     
     Hello(A aobj){
 		System.out.println("1 para cons in Hello(hello-A)");
 		this.aobj=aobj;
 	}
     
	Hello(B bobj){
		System.out.println("1 para cons in Hello(hello-B)");
		this.bobj=bobj;
	}
	
	
//	Hello(A aobj,B bobj){
//		System.out.println("2 para cons in Hello(hello-AB)");
//		this.aobj=aobj;
//		this.bobj=bobj;
//	}
	
	public void showHello() {
		  System.out.println("show in Hello ");
		 System.out.println(aobj);
		 System.out.println(bobj);
}
}
