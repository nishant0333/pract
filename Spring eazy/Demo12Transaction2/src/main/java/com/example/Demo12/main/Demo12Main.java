package com.example.Demo12.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Demo12.config.ProductConfig;
import com.example.Demo12.service.ProductService;

public class Demo12Main {

	public static void main(String[] args)  {
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ProductConfig.class);

		ProductService productService=context.getBean("productService",ProductService.class);
		
		productService.saveProductService();
		
		
		
		context.registerShutdownHook();
		context.close();
	}

}
