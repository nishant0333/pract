package com.jlcindia.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration  
@ComponentScan(basePackages = {"com.jlcindia.spring"})  

public class JLCAppConfig {
	@Bean(name = "dataSource")  
	public DataSource getDataSource() {  
	BasicDataSource bds = new BasicDataSource();  
	bds.setDriverClassName("com.mysql.jdbc.Driver");  
	bds.setUrl("jdbc:mysql://localhost:3306/mycustomers");  
	bds.setUsername("root");  
	bds.setPassword("ojha");  
	bds.setMaxActive(5);  
	return bds;  
	}  
	@Bean(name = "jtemp")  
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {  
	JdbcTemplate jtemp = new JdbcTemplate(dataSource);  
	return jtemp;  
	}  
	}



