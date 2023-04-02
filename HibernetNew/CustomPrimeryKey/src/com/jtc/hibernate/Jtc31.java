package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class Jtc31 {
public static void main(String[] args) {
	try {
	SessionFactory sf=HibernatUtil.getSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Customer cust=new Customer("som","som@jtcindia.com",123456);
	session.save(cust);
	//Integer it=(Integer)session.save(cust);
//	System.out.println(it.intValue());
	tx.commit();
	session.close();	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
