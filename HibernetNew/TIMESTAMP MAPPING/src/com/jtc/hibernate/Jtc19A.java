package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc19A {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session =sf.openSession();
		tx=session.beginTransaction();
		Customer cust=new Customer(103,"Jtc2","Jtc2@jtcindia.org",74747476);
//		Customer cust1=new Customer(104,"Jtc3","Jtc3@jtcindia.org",74747477);
		session.save(cust);
//		session.save(cust1);
		tx.commit();
		session.close();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.println("value inserted");
	}
  }	
}
