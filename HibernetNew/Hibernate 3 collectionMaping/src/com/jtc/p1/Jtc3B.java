package com.jtc.p1;
import org.hibernate.*;
import java.util.*;
public class Jtc3B {
public static void main(String[] args) {
	try {
		SessionFactory sf=ChibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		StudentOne stu=(StudentOne)session.load(StudentOne.class,1);
		System.out.println(stu.getSid()+"\t"+stu.getSname()+"\t"+stu.getDob());
	
		System.out.println(stu.getQulification());
		
		System.out.println(stu.getMarkes());
		System.out.println(stu.getEmails());
		System.out.println(stu.getPhone());
		System.out.println(stu.getRefs());
		
		tx.commit();
		session.close();
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
}
}
