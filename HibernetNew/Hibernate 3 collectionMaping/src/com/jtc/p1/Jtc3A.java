package com.jtc.p1;
import org.hibernate.*;
import java.util.*;



public class Jtc3A {
public static void main (String[] args) {
	Transaction tx=null;
try {
	
	SessionFactory sf=ChibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	 tx=session.beginTransaction();
	String cous[]= {"java","JDBC","JSP"};
	List<String>ems=new ArrayList<String>();
	ems.add("aa@jtc");
	ems.add("bb@jtc");
	ems.add("cc@jtc");
	List<Integer>maks=new ArrayList<Integer>();
	maks.add(new Integer(100));
	maks.add(new Integer(99));
	maks.add(new Integer(100));
	Set<Long>phs=new HashSet<>();
	phs.add(new Long(1111));
	phs.add(new Long(2222));
	phs.add(new Long(3333));
	Map<String,Long>refs=new HashMap<String,Long>();
	refs.put("aaa",new Long(1111));
	refs.put("bbb",new Long(2222));
	refs.put("ccc",new Long(3333));
	StudentOne stu=new StudentOne(101,"som","10-10-10","M.Sc",cous,ems,maks,phs,refs);
	
	session.save(stu);
	tx.commit();
	session.close();
	
}catch(Exception e)
{
	e.printStackTrace();
	if(tx!=null)
		tx.rollback();
}
}
}
