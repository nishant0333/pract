package com.jtc.hibernate;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor si, Object obj) throws HibernateException {
	HibernateException{
		String sid="C-001";
		try {
			Configuration cfg=new Configuration().configure();
			SessionFactory sf= cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			Query q1=s.createQuery("from Customer cust");
			int size=q1.list().size();
			if(size!=0) {
				Query query=s.createQuery("select max(cust.cid)from Customer cust");
				
				
				
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}	
		return null;
	}

		
		
}
	
	


