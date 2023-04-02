package com.jtc.hibernat;

public class HibernateCustomerDAO implements CustomerDAO {

	//Add Customer
	//@Override
public int addCustomer(CustomerTo cto) {
	Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
	Integer it=(Integer)HibernateTemplate.saveObject(cust);
	return it.intValue();
}

//update Customer
	//@Override
public void updateCustomer(CustomerTo cto) {
	Customer cust=new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
	HibernateTemplate.updateObject(cust);
}

//Delete Customer
	//@Override
public void  deleteCustomer(int cid) {
	HibernateTemplate.deleteObject(Customer.class,cid);
}

//Get customer by CID
	//@Override
public CustomerTo getCustomerByCid(int cid) {
Customer cust=(Customer)HibernateTemplate.loadObject(Customer.class,cid);
CustomerTo cto=new CustomerTo(cust.getCid(),cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity(),cust.getStatus());
return cto;
}
}

