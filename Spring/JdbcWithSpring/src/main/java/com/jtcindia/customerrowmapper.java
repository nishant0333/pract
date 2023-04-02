package com.jtcindia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class customerrowmapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cust = new Customer();
		cust.setSid(rs.getInt(1));
		cust.setCname(rs.getString(2));
		cust.setEmail(rs.getString(3));
		cust.setPhone(rs.getInt(4));
		cust.setCity(rs.getString(5));
		return cust;
		
	}

}
