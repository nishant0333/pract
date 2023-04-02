package com.jtcindia;

import java.util.List;

public interface CustomersDAO {
public void addCustomer(Customer cust);
public void updateCustomer(Customer cust);
public void deleteCustomer(int sid);
List<Customer> getAllCustomer();
List<Customer> getCustomerbycity(String city);

}
