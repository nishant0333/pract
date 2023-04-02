package com.test;
final class Employee{

private String name;
private int salary;
Employee(String name,int salary){
this.name=name;
this.salary=salary;
}
public Employee m1(String name,int salary){
if(this.name==name && this.salary==salary) {
return this;

}
else{
	
return( new Employee( name, salary));

}}

//Employee e1=new Employee("nishant",1000);
//Employee e2=new Employee("ravi",1500);
//Employee e3=e1.m1("nishant",1000);

}

public class Employee1 {

	public static void main(String[] args) {
		Employee e5=new Employee("subham",5000);
		Employee e6=e5.m1("subham",5000 );
System.out.println(e5==e6);
	}

}
