package com.spring.beans;

public class Hello {
	 private A aobj;
     private B bobj;
     Hello(){
    	 System.out.println("def cons in Hello");
     }
     {
    	 System.out.println("ib in Hello");
     }
     static {
    	 System.out.println("sb in Hello");
     }
	public void setAobj(A aobj) {
		System.out.println("set A  a in Hello");
		this.aobj = aobj;
	}
//	
//	Hello(B bobj){
//		System.out.println("1 para cons in Hello");
//		this.bobj=bobj;
//	}
	
	
	
	public void showHello() {
		  System.out.println("show in Hello ");
		  aobj.show();
		  bobj.showB();
}



	public B getBobj() {
		return bobj;
	}



	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
}
