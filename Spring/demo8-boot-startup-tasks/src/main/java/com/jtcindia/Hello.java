package com.jtcindia;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class Hello {
	@Autowired(required = false)
	JdbcTemplate jtemp;
	
	@Autowired(required = false)
	DataSource ds;
	
	public Hello() {
		System.out.println("Hello-D.C");
		System.out.println("A."+ ds);
		System.out.println("B."+ jtemp);
	}

}
