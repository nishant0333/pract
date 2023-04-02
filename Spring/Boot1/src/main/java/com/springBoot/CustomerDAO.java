package com.springBoot;

import java.util.List;

import com.springBoot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
public interface CustomerDAO {
public void addCustomer(Customer cust);
public List<Customer> getAllCustomers();
public List<Customer> getCustomersByCity(String city);
}
