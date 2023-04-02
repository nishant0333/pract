package com.jtc.springboot;
import java.util.List;
public interface CustomerDAO {
	public void addCustomer(Customer cust);
	public List<Customer> getAllCustomers();
	public List<Customer> getCustomersByCity(String city);
}
