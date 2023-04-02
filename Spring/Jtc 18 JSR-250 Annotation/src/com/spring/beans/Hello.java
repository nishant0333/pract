package com.spring.beans;

import javax.annotation.*;
public class Hello {
@Resource(name="ao2")
	 private A aobj;
     
   @Resource(name="bo2")  
	 private B bobj;
     
     
	//Default constructor
     Hello(){
    	 System.out.println("def cons in Hello");
     }
     {
    	 System.out.println("ib in Hello");
     }
     static {
    	 System.out.println("sb in Hello");
     }
    
	Hello(B bobj){
		System.out.println("1 para cons in Hello");
		this.bobj=bobj;
	}
   
     public void setAobj(A aobj) {
 		System.out.println("set A  a in Hello");
 		this.aobj = aobj;
 	}
	
	public B getBobj() {
		return bobj;
	}
	 
	public void setBobj(B bobj) {
		System.out.println("set bobj in Hello");
		this.bobj = bobj;
	}
	


	public void showHello() {
		  System.out.println("show in Hello ");
		  aobj.show();
		  bobj.showB();
		  System.out.println(aobj);
		  System.out.println(bobj);
}

}
