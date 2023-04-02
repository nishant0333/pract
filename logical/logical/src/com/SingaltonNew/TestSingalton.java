package com.SingaltonNew;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class TestSingalton {

	public static void main(String[] args) throws Exception{
		SingaltonNew s1=SingaltonNew.getInstance();
		SingaltonNew s2= SingaltonNew.getInstance();
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());

//Reflection 
//  Constructor<SingaltonNew> s3 = SingaltonNew.class.getDeclaredConstructor();
//  s3.setAccessible(true);
//  SingaltonNew s4=s3.newInstance();
//  //System.out.println(s3.hashCode());
//  System.out.println(s4.hashCode());

// Serialization
// converting object into series of bytes and sanding over network

FileOutputStream file=new FileOutputStream("C:\\Users\\Neha\\Desktop\\serilize.txt");
ObjectOutputStream out=new ObjectOutputStream(file);
out.writeObject(s1);

//De-Serialization

FileInputStream f=new FileInputStream("C:\\Users\\Neha\\Desktop\\serilize.txt");
ObjectInputStream in=new ObjectInputStream(f);
SingaltonNew s5=(SingaltonNew)in.readObject();
System.out.println(s5.hashCode());


//clone
SingaltonNew s6 =(SingaltonNew)s1.clone();
System.out.println(s6.hashCode());
	}

}
