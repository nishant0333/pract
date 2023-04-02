package com.jtcindia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository("cdao")
@Component
public class CustomerDAOimpl implements CustomersDAO {

	@Autowired
	JdbcTemplate jdbctemp;

	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		String sql = "insert into customer values(?,?,?,?,?)";
		jdbctemp.update(sql, cust.getSid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());

	}

	@Override
	public void updateCustomer(Customer cust) {
		String sql = "update customer set cname=?,email=?,phone=?,city=? where sid=?";
		jdbctemp.update(sql, cust.getCname(), cust.getEmail(), 
				cust.getPhone(), cust.getCity(),cust.getSid());
	}

	@Override
	public void deleteCustomer(int sid) {
		String sql = "delete from customer where sid=?";
		jdbctemp.update(sql, sid);

	}
	

	@Override
	public List<Customer> getAllCustomer() {
		String sql="select * from customer";
		List<Customer>mylist=jdbctemp.query(sql,new customerrowmapper());
		return mylist;
	}

	@Override
	public List<Customer> getCustomerbycity(String city) {
		String sql="select * from customer where city=?";
		List<Customer>mylist=jdbctemp.query(sql,new customerrowmapper(),city);
		return mylist;
	}

}
