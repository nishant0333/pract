package com.Singalton;

import java.io.Serializable;

public class mySingalton  implements Serializable,Cloneable  {
	
	//prevent from clone
protected Object clone() throws CloneNotSupportedException{
	throw new CloneNotSupportedException();
}

	private mySingalton() {
		if(instance !=null) {
			throw new IllegalThreadStateException("can not creat instance through reflection");
		}
		
	}
	private static mySingalton instance;
	public static synchronized mySingalton getInstance() {
		if(instance==null) {
			return instance =new mySingalton();		
		}
		else {
			return instance;
		}
	}
	protected Object readResolve() {
		return instance;
	}
}
