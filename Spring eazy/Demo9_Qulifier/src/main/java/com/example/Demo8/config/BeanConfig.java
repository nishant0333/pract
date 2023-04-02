package com.example.Demo8.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.Demo8.bean", "com.example.Demo8.Service",
		"com.example.Demo8.implememtation" })
//@ComponentScan(basePackageClasses = { com.example.Demo8.bean.Person.class, com.example.Demo8.bean.Vehicle.class })
public class BeanConfig {

}
