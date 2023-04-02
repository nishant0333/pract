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

     // 2-para-constructor
public Hello(@Qualifier("ao1")A ao,@Qualifier("bo1") B bo) {
	super();
	this.aobj = ao;
	this.bobj = bo;
}

	public void showHello() {
		  System.out.println("show in Hello ");
		  System.out.println(aobj);
		  System.out.println(bobj);
}

}
