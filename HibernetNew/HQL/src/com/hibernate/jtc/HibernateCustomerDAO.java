package com.hibernate.jtc;
import java.util.*;
public class HibernateCustomerDAO implements CustomerDAO {
	
	
public int addCustomer(Customer cust) {
	Integer it=(Integer)HibernateTemplate.save(cust);
	return it.intValue();
}


public void updateCustomer(Customer cust) {
	HibernateTemplate.update(cust);
}


public void deleteCustomer(int cid) {
	HibernateTemplate.delete(Customer.class,cid);
}


public Customer getCustomerByCid(int cid) {
	Customer c=(Customer)HibernateTemplate.load(Customer.class,cid);
	return c;
}


public Customer getCustomerbyEmail(String email) {
	String hql="from Customer c where c.email=?0";
	Customer c =(Customer)HibernateTemplate.findObject(hql,email);
	return c;
}


public Customer getCustomerCardNo(int ccno) {
	String hql="from Customer c where c.cardNo=?0";
	Customer c=(Customer)HibernateTemplate.findObject(hql, ccno);
	return c;
}


public List<Customer>getAllCustomers(){
	String hql="from Customer c";
	List<Customer>list=HibernateTemplate.getList(hql);
	return list;
}


public List<Customer>getAllCustomers(int start,int total){
	String hql="from Customer c";
	List<Customer> list=HibernateTemplate.getList(hql,start,total);
	return list;
}


public List<Customer> getCustomersByCity(String city){
	String hql="from Customer c where c.city=?0";
	List<Customer> list=HibernateTemplate.getList(hql,city);
	return list;
}


//public List<Customer> getCustomerByCity(String city,int start,int total){
//	String hql="from Customer c Where c.city=?0";
//	List<Customer>list=HibernateTemplate.findList(hql,start,total,city);
//	return list;
//}


public List<Customer> getCustomersByName(String name){
	String hql="from Customer c Where c.cname=?0";
	List<Customer> list=HibernateTemplate.getList(hql,name);
	return list;
}


public List<Customer>getCustomersByName(String name,int start,int total){
	String hql="from Customer c where c.cname=?0";
	List<Customer> list=HibernateTemplate.findList(hql, start, total,name);
	return list;
}


public List<Customer>getCustomersByCardType(String cardType){
	String hql="from Customer c where c.cardType=?0";
	List<Customer>list=HibernateTemplate.getList(hql,cardType);
	return list;
}


public List<Customer>getCustomerByCardType(String cardType,int start,int total){
	String hql="from Customer c where c.cardType=?0";
	List<Customer>list=HibernateTemplate.findList(hql, start, total,cardType);
	return list;
}


public List<Customer>getCustomersByStatus(String status){
	String hql="from Customer c where c.status=?0";
	List<Customer>list=HibernateTemplate.getList(hql,status);
	return list;	
}


public List<Customer>getCustomersByStatus(String status,int start,int total ){
	String hql="from Customer c where c.status=?0";
	List<Customer>list=HibernateTemplate.findList(hql,start,total,status);
	return list;
}


public List<Customer>getCustomersByBal(double bal){
	String hql="from Customer c where c.cardBal=?0";
	List<Customer>list=HibernateTemplate.getList(hql,bal);
	return list;
}


public List<Customer>getCustomersByBal(double bal,int start,int total){
	String hql="from Customer c where c.cardBal=?0";
	List<Customer> list=HibernateTemplate.findList(hql, start, total,bal);
	return list;
}


//public List<Customer>getCustomers(String city,String cardType){
//	
//}
public List<Customer>getCustumers(String city,String cardType,String status){
String hql="from Customer c where c.cardBal=?0 and c.cardType=?1 and c.ststus=?2";
List<Customer> list= HibernateTemplate.getList(hql,city,cardType,status);
return list;
}


@Override
public Customer getCustomerByEmail(String email) {
	String hql="from Customer c where c.email=?0";
	Customer c =(Customer)HibernateTemplate.findObject(hql,email);
	return c;
}


@Override
public Customer getCustomerByCardNo(int ccno) {
	String hql="from Customer c where c.cardNo=?0";
	Customer c=(Customer)HibernateTemplate.findObject(hql, ccno);
	return c;
}


@Override
public List<Customer> getCustomersByCity(String city, int start, int total) {
	String hql="from Customer c Where c.city=?0";
	List<Customer>list=HibernateTemplate.findList(hql,start,total,city);
	return list;
}
@Override
public List<Customer> getCustomersByCardType(String cardType, int start, int total) {
	String hql="from Customer c where c.cardType=?0";
	List<Customer>list=HibernateTemplate.getList(hql,cardType);
	return list;
}


@Override
public List<Customer> getCustomers(String city, String cardType, String status) {
	String hql="from Customer c where c.city=?0 and c.cardType=?1 and c.status=?2";
	List<Customer> list= HibernateTemplate.getList(hql,city,cardType,status);
	return list;
}

}
