package com.hibernate.jtc;
import java.util.*;
public interface CustomerDAO {
public int addCustomer(Customer cust);
public void updateCustomer(Customer cust);
public void deleteCustomer(int cid);
public Customer getCustomerByCid(int cid);
public List<Customer> getCustomerByEmail(String email);
//public Customer getCustomerByCardNo(int ccno);
//public List<Customer>getAllCustomers();
//public List<Customer>getAllCustomers(int start,int total);
//public List<Customer>getCustomersByCity(String city);
//public List<Customer>getCustomersByCity(String city,int start,int total);
//public List<Customer>getCustomersByName(String name);
//public List<Customer>getCustomersByName(String name,int start,int total);
//public List<Customer>getCustomersByCardType(String cardtype);
//public List<Customer>getCustomersByCardType(String cardtype,int start,int total);
//public List<Customer>getCustomersByStatus(String status);
//public List<Customer>getCustomersByStatus(String status,int start,int total);
//public List<Customer>getCustomersByBal(double bal);
//public List<Customer>getCustomersByBal(double bal,int start,int total);
////public List<Customer>getCustomers(String city,String cardtype);
//public List<Customer>getCustomers(String city,String cardtype,String status);
////public List<Customer>getCustomers(String city,String cardtype,int start,int total);
////public List<Customer>getCustomers(String city,String cardtype,String status,int start,int total);	
}
