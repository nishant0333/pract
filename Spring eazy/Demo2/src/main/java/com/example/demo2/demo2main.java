package com.example.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class demo2main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(config.class);
Person person=ctx.getBean("Ram",Person.class);
System.out.println(person.getName());
	}

}
