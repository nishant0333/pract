package com.example.Demo12.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan({"com.example.Demo12.service","com.example.Demo12.repo","com.example.Demo12.dto"})
@EnableTransactionManagement
public class ProductConfig {

	@Bean
	public DataSource dataSource() {

		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/spring", "root", "nishant");
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {

		return new JdbcTemplate(dataSource());
	}
	@Bean
	public TransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
		
		
	}
}
