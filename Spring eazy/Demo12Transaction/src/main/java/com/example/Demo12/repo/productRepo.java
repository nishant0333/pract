package com.example.Demo12.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Demo12.dto.Product;

@Repository
public class productRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//@Transactional
	public  void saveProductRepo(Product product) {
		
		String sql="insert into product values(?,?)";
		Object [] arg={product.getId(),product.getName()};
		jdbcTemplate.update(sql, arg);
		
		System.out.println("Product saved ...");

	}
}
