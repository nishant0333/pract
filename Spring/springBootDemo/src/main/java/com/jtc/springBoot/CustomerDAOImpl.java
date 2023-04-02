package com.jtc.springBoot;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository("custDAO")
public class CustomerDAOImpl implements CustomerDAO {
	
	
   @Autowired
   JdbcTemplate jtemp;
	
	
	public void addCustomer(Customer cust) {
		String sql="insert into customertable values(?,?,?,?,?)";
		jtemp.update(sql,cust.getCid(),cust.getCname(),cust.getEmail(),
				cust.getPhone(),cust.getCity());
		
	}


	public List<Customer> getAllCustomers() {
		String sql = "select * from customertable";
		List<Customer> mylist = jtemp.query(sql, new CustomerRowMapper());
		return mylist;
	}


	public List<Customer> getCustomersByCity(String city) {
		String sql = "select * from customertable where city=?";
		List<Customer> mylist = jtemp.query(sql, new CustomerRowMapper(), city);
		return mylist;
	}

}
