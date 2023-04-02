package com.jtcindia;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class HelloDAO {
	@Autowired(required = false)
	JdbcTemplate jtemp;
	
	@Autowired(required = false)
	DataSource ds;
	
	public HelloDAO() {
		System.out.println("HelloDAO-D.C");
		System.out.println("A."+ ds);
		System.out.println("B."+ jtemp);
}
}