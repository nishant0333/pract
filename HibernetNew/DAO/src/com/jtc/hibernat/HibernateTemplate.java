package com.jtc.hibernat;

import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {
public static Object saveObject(Object obj) {
	Object id=null;
	try {
	SessionFactory sf=HibernatUtil.getSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	id=session.save(obj);
	tx.commit();
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return id;
}

public static void updateObject(Object obj) {
	
	//Object id=null;
	try {
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
public static Object loadObject(Class cls,Serializable s) {
	Object o=null;
	try {
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		o=session.get(cls,s);
		tx.commit();
		session.close();
		
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return o;
}
public static void deleteObject(Class cls,Serializable s) {
	Object id=null;
	try {
	SessionFactory sf=HibernatUtil.getSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Object o=session.get(cls,s);
	session.delete(o);
	tx.commit();
	session.close();
	}catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
}
}
