package com.jtcindia;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@SpringBootApplication
public class MyBootApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx;

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jtemp;
	@Autowired
	NamedParameterJdbcTemplate npjtemp;

	@Autowired
	DataSourceTransactionManager txManager;

	@Autowired(required = false)
	HelloDAO helloDAO;

	@Autowired(required = false)
	HelloService helloService;

	@Autowired
	HaiDAO haiDAO;

	@Autowired
	HaiService haiService;

	@Autowired
	Hello hello;

	@Autowired
	Hai hai;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("1." + ctx);
		System.out.println("2.Bean Count:" + ctx.getBeanDefinitionCount());
		System.out.println("3." + datasource);
		System.out.println("4." + jtemp);
		System.out.println("5." + npjtemp);
		System.out.println("6." + txManager);
		System.out.println("7." + helloDAO);
		System.out.println("8." + helloService);
		System.out.println("9." + haiDAO);
		System.out.println("10." + haiService);
		System.out.println("11." + hello);
		System.out.println("12." + hai);
		System.out.println("---------------------");
		System.out.println("13." + ctx.getBeanDefinitionCount());
		String beanNames[] = ctx.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
		System.out.println("Done!!!");
	}

	public static void main(String[] args) {
		System.out.println("Main Begin");
		SpringApplication.run(MyBootApplication.class, args);
		System.out.println("main end");
	}

	@Bean(name = "myhello1")
	public Hello getHello() {
		return new Hello();
	}

	@Bean(name = "myhai1")
	public Hai getHai1() {
		return new Hai();

	}

	@Bean(name = "myhello2")
	public Hello getHello2() {
		return new Hello();
	}

	@Bean(name = "myhai2")
	public Hai getHai2() {
		return new Hai();
	}

}
