package com.jtc.springboot;
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

		String sql = "insert into mycustomers values(?,?,?,?,?)";
		jtemp.update(sql, cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());
	}

	@Override
	public List<Customer> getAllCustomers() {
		String sql = "select * from mycustomers";
		List<Customer> mylist = jtemp.query(sql, new CustomerRowMapper());
		return mylist;
	}
	
	@Override
	public List<Customer> getCustomersByCity(String city) {
		String sql = "select * from mycustomers where city=?";
		List<Customer> mylist = jtemp.query(sql, new CustomerRowMapper(), city);
		return mylist;
	}
}

