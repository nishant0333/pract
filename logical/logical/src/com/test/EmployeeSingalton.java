package com.test;

public class EmployeeSingalton {
private EmployeeSingalton() {}

private static EmployeeSingalton instance;

public static synchronized EmployeeSingalton getInstance() {
	if(instance==null) {
		
		return instance=new EmployeeSingalton();
	}
	else {
		return instance;
	}
}


}
