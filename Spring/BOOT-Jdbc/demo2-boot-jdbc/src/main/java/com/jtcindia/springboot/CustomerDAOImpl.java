package com.jtcindia.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("custDAO")
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	JdbcTemplate jtemp;

	@Override
	public void addCustomer(Customer cust) {
		String SQL = "insert into mycustomers values(?,?,?,?,?)";

		jtemp.update(SQL, cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());
	}

	@Override
	public List<Customer> getAllCustomers() {
		String SQL = "select * from mycustomers";
		List<Customer> mylist = jtemp.query(SQL, new CustomerRowMapper());
		return mylist;
	}

	@Override
	public List<Customer> getCustomersByCity(String city) {
		String SQL = "select * from mycustomers where city=?";
		List<Customer> mylist = jtemp.query(SQL, new CustomerRowMapper(), city);
		return mylist;
	}

	@Override
	public List<Customer> getCustomersByEmail(String email) {
		String SQL = "select * from mycustomers where email=?";
		List<Customer> mylist = jtemp.query(SQL, new CustomerRowMapper(), email);
		return mylist;

	}
}
