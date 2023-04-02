package com.Singalton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class breakSingalton {

	public static void main(String[] args) throws CloneNotSupportedException ,InterruptedException,InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		mySingalton instance1=mySingalton.getInstance();
		//mySingalton instance2=(mySingalton)instance1.clone();
System.out.println(instance1.hashCode());
//System.out.println(instance2.hashCode());

//Constructor[] constructors= mySingalton.class.getDeclaredConstructors();
//
//for(Constructor constructor:constructors) {
//	constructor.setAccessible(true);
//	mySingalton reflectionInstance=(mySingalton)constructor.newInstance();
//	System.out.println(reflectionInstance.hashCode());
//}
     //Serialization
ObjectOutput out=new ObjectOutputStream(new FileOutputStream("singleton.scr"));
out.writeObject(instance1);
out.close();

// Deserialization

ObjectInput in=new ObjectInputStream(new FileInputStream("singleton.ser"));
mySingalton instance2=(mySingalton)in.readObject();
in.close();
System.out.println("instance1 hashcode :"+instance1.hashCode());
System.out.println("instance2 hashcode :"+instance2.hashCode());
	}   

}
