package com.jtc.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertValues {
public static void main(String[] args) {
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();

Emp e1=new Emp();
e1.setEid(23);
e1.setEname("Nishant");

Emp e2=new Emp();
e2.setEid(24);
e2.setEname("Ram");

Project p1=new Project();
p1.setPid(12);
p1.setPname("LED light");

Project p2=new Project();
p2.setPid(15);
p2.setPname("FAN");

List<Emp> list1=new ArrayList<Emp>();
list1.add(e1);
list1.add(e2);

List<Project> list2=new ArrayList<Project>();
list2.add(p1);
list2.add(p2);

e1.setProject(list2);
//e2.setProject(list2);
//p1.setEmp(list1);
p2.setEmp(list1);

Session s=factory.openSession();
Transaction tx=s.beginTransaction();
s.save(e1);
s.save(e2);
s.save(p1);
s.save(p2);

tx.commit();
s.close();
}
}
