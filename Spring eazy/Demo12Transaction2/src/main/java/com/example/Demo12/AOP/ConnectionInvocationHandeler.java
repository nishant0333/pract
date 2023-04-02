package com.example.Demo12.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

public class ConnectionInvocationHandeler implements InvocationHandler {

	private Connection connection;

	public ConnectionInvocationHandeler(Connection connection) {
		this.connection = connection;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().contains("commit")
		|| method.getName().contains("rollback")
		|| method.getName().contains("close"))
		{
		System.out.println("connection Trace :" + method.toGenericString());
		}
		Object returnValue = method.invoke(connection, args);

		return returnValue;
	}

}
