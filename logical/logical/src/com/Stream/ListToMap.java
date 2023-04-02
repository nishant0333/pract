package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
class Student{
int id;
String name;
double marks;

public Student(int id,String name,double marks) {
	this.id=id;
	this.name=name;
	this.marks=marks;	
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}	
	
}

public class ListToMap {

	public static void main(String[] args) {
		List<Student> s=new ArrayList<>();
		s.add(new Student(1,"abc",450));
		s.add(new Student(2,"xyz",430));
		s.add(new Student(3,"pqr",470));
		s.add(new Student(4,"qwe",500));
		
Map<Integer,Student> map=s.stream().collect(Collectors.toMap(a->a.id,e->e));
Map<Integer,String> map1=s.stream().collect(Collectors.toMap(a->a.id,e->e.name));
System.out.println(map);
System.out.println("............................");
System.out.println(map1);
	}

}
