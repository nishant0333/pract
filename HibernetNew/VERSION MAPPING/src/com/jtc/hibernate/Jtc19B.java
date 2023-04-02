package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Jtc19B {
public static void main(String[] args) {
	Transaction tx=null;
	try {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		Customer cust=(Customer)session.load(Customer.class,101);
		Customer cust1=(Customer)session.load(Customer.class,102);
		cust.setCname("nishant");
		cust1.setCname("mohan");
		session.update(cust);
		session.update(cust1);
		tx.commit();
		session.close();
		System.out.println("record inserted");
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
