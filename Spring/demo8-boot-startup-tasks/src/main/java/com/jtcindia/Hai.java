package com.jtcindia;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Hai {
	@Autowired(required = false)
	JdbcTemplate jtemp;
	@Autowired(required = false)
	DataSource ds;
	public Hai() {
		System.out.println("Hai-D.C");
		System.out.println("A."+ ds);
		System.out.println("B."+ jtemp);
	}
}
