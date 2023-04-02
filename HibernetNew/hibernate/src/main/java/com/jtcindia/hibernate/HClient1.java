package com.jtcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HClient1 {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session sessoin = sf.openSession();
			tx = sessoin.beginTransaction();
			Customer cust = new Customer(101, "abc", "sp@jtcindia.org", 38337989, "nooida", 9000.00);
			sessoin.save(cust);
			tx.commit();
			sessoin.close();
			System.out.println("inserted......");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
