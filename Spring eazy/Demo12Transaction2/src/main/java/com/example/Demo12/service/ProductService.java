package com.example.Demo12.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Demo12.dto.Product;
import com.example.Demo12.repo.productRepo;


@Service
public class ProductService {
	@Autowired
	private productRepo productRepo;

	
	@Transactional(propagation = Propagation.REQUIRED,
			       isolation =Isolation.REPEATABLE_READ,
			       rollbackFor = Exception.class,
			       readOnly = false)
	
	public void saveProductService()  {

		for (int i =1; i<= 10; i++) {
			Product product =new Product();
			product.setId(i);
			product.setName("Test product" +i);
			
			productRepo.saveProductRepo(product);
			
			if (i==7) {
				throw new RuntimeException("Some Errot happen...");
			}
		}
	}
}
