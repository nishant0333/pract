package com.example.Demo12.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Calltracker {

	@Pointcut("within(com.example.Demo12.service.*) ||within(com.example.Demo12.repo.*) ")
	public void LogBeforPoinCut() {

	}

	@Around("LogBeforPoinCut()")
	public Object logBeforeMethodCall(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println("method is Starting.." + proceedingJoinPoint.getSignature().getName());
		
		Object returnValue = proceedingJoinPoint.proceed();
		System.out.println(returnValue);
		
		System.out.println("method is Completed.." + proceedingJoinPoint.getSignature().getName());
		return returnValue;
	}
}
