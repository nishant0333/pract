package com.example.Demo10.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.Demo10.implementation"
		,"com.example.Demo10.service","com.example.Demo10.Ascept"})
@EnableAspectJAutoProxy
public class ConfigBean {

	
	
}
