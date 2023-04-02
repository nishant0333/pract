package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Hello {
	 private A aobj;
     
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
		  
		  System.out.println(aobj);
		  System.out.println(bobj);
}

}
