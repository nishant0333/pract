package com.example.Demo10.Ascept;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;


@Aspect
@Component
@Order(2)
public class LoggerAspect {

//	@Pointcut("within(com.example.Demo10.service.*)")
//	public void DefinPointcut() {
//			
//	}
	
//	@Pointcut("execution(* com.example.Demo10.service.*.*(..))")
//	public void DefinPointcut() {
//			
//	}
	
	 
	//fully qualified name
	@Pointcut("target(com.example.Demo10.service.VehicleService)")
	public void DefinPointcut() {
			
	}
	
	
//	@Before("within(com.example.Demo10.service.*)")
//	public void startMethod() {
//		
//		System.out.println("method is started");
//	}
	
	@Before("DefinPointcut()")
	public void startMethod() {
		
		System.out.println("method is started");
	}
    
}
