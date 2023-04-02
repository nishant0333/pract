package com.jtc.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Clinte1 {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			CustomerAnno anno = new CustomerAnno(11, "abc", "s@gmail", 38938, "noida", 2222.33);
			session.save(anno);
			tx.commit();
			session.close();
			sf.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
