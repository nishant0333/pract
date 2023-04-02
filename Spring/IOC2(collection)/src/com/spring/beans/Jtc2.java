package com.spring.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Jtc2 {
public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");	
Customer cust=(Customer)ctx.getBean("cust");
cust.show();
}
}
