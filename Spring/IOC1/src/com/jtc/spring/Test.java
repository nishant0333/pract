package com.jtc.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
        System.out.println("test in main ");
        System.out.println("************");
        try {
        ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");
        System.out.println("&&&&&&&&&&&&&&&&&&&");
        System.out.println("spring container is ready ");
        System.out.println("+++++++++++++++++++");
        
        
        //ac.getBean("abc");
        A a1= (A) ac.getBean("a1");
        System.out.println("@@@@@@@@@@@@@@@@");
        a1.show();
        System.out.println("##############");
        A a2= (A) ac.getBean("a1");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%");
        System.out.println(a1==a2);
        B b1=(B)ac.getBean("b1");
        b1.showB();
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
