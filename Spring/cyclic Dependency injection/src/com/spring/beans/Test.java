package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	System.out.println("********test in main*******");
	 ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");
//	 Hello hello=(Hello)ctx.getBean("hello");
//     hello.showHello();
     Hai hai=(Hai)ctx.getBean("hai");
     hai.showHai();
}
}
