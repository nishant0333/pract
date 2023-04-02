package com.hibernate.jtc;

public class DAOFactory {
static CustomerDAO customerDAO=null;
static {
	customerDAO=new HibernateCustomerDAO();
}
public static CustomerDAO getCustomerDAO() {
	return customerDAO;
}
}
