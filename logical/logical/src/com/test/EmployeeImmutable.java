package com.test;


final class EmployeeImmutable{

private String name;
private int salary;
EmployeeImmutable(String name,int salary){
this.name=name;
this.salary=salary;
}
public EmployeeImmutable m1(String name,int salary){
if(this.name==name && this.salary==salary) {
return this;

}
else{
	
return( new EmployeeImmutable( name, salary));

}}
public static void main(String[] args){
EmployeeImmutable e1=new EmployeeImmutable("nishant",1000);
EmployeeImmutable e2=new EmployeeImmutable("ravi",1500);
EmployeeImmutable e3=e1.m1("nishant",1000);
System.out.println(e1==e3);

}

}
