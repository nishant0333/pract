package com.hibernate.jtc;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateTemplate {

	
	//1.save method
public static Object save(Object obj) {
	
	Transaction tx=null;
	Object ob=null;
	try{
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		ob=session.save(obj);
		tx.commit();
		
	}catch (Exception e) {
		if(tx!=null) {
			tx.rollback();
		}
		e.printStackTrace();
	}
	return ob;
}


//2.load method
public static Object load(Class cls, Serializable id) {
	Transaction tx=null;
	Object obj=null;
	try {
		SessionFactory sf =HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		obj=session.load(cls,id);
		tx.commit();
		session.close();
		
	}catch (Exception e) {
		if(tx!=null) {
			tx.rollback();
		}
		e.printStackTrace();
	}
	return obj;
}

//3.delete method
public static void delete(Class cls,Serializable id) {
	Transaction tx=null;
	Object obj =null;
	try {
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		session.load(cls, id);
		tx.commit();
		session.close();
		
	}catch (Exception e) {
	if (tx!=null) {
		tx.rollback();
	}
	e.printStackTrace();
	}
}

//4.update method
public static void update(Object obj) {
	Transaction tx=null;
	try {
		SessionFactory sf= HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		session.update(obj);
		tx.commit();
		session.close();
		
	}catch (Exception e) {
	if(tx!=null) {
		tx.rollback();
		}
	e.printStackTrace();
	}
}

//5.getList method
public static List getList(String hql,Object... args) {
	Transaction tx=null;
	List list=null;
	try {
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx= session.beginTransaction();
		org.hibernate.Query q=session.createQuery(hql);
		
		for(int i=0;i<args.length;i++) {
			q=q.setParameter(i, args[i]);
		}
		list=q.list();
		tx.commit();
		session.close();
		
		
	}catch (Exception e) {
	if(tx!=null) {
		tx.rollback();
		
	}
	e.printStackTrace();
	}
	return list;
}


//6.findList method
public static List findList(String hql,int start,int total,Object...args) {
	Transaction tx=null;
	List list=null;
	try {
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx= session.beginTransaction();
		org.hibernate.Query q=session.createQuery(hql);
		q=q.setFirstResult(start);
		q=q.setMaxResults(total);
		for(int i=0;i<args.length;i++) 
		{
			q=q.setParameter(i, args[i]);	
		}
		list=q.list();
		tx.commit();
		session.close();
		
	}catch (Exception e) {
	if(tx!=null) {
		tx.rollback();
	}
	e.printStackTrace();
	}
	return list;	
}


//7.findObject method
public static Object findObject(String hql,Object... args) {
	
	Transaction tx=null;
	Object obj=null;
	try {
		SessionFactory sf=HibernatUtil.getSessionFactory();
		Session session=sf.openSession();
		tx= session.beginTransaction();
		org.hibernate.Query q=session.createQuery(hql);
		
		for(int i=0;i<args.length;i++) {
			q=q.setParameter(i, args[i]);
		}
		obj=q.uniqueResult();
		tx.commit();
		session.close();
		
	}catch (Exception e) {
		if(tx!=null) {
			tx.rollback();
		}
		e.printStackTrace();
		}
	return obj;
	}
}

