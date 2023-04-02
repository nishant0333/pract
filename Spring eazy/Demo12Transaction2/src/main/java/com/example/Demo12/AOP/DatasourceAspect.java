package com.example.Demo12.AOP;

import java.lang.reflect.Proxy;
import java.sql.Connection;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.mysql.cj.jdbc.ConnectionImpl;

@Component
@Aspect
public class DatasourceAspect {

	@Around("target(javax.sql.DataSource)")
	public Object logDatasourceConnectionInfo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		System.out.println("Datasource Tracker :"
		+ proceedingJoinPoint.getSignature());

		Object returnValue = proceedingJoinPoint.proceed();// getConnection method of javax.sql.DataSource interface and
															// return connectionImpl object

		if (returnValue instanceof Connection) {
			
			Connection con = (Connection) Proxy.newProxyInstance(
			ConnectionImpl.class.getClassLoader(),
			new Class[] { Connection.class },
			new ConnectionInvocationHandeler((Connection) returnValue));
			return con;
		}
		return returnValue;
	}
}
