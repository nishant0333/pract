package com.jtc.p1;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class ChibernateUtil {
 public static SessionFactory factory;
static {
	
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		factory=cfg.buildSessionFactory();	
	
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}

