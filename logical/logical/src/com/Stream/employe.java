package com.Stream;

public class employe {
	
		private String name;
		private int age;
		private int salary;
		
		public employe(String name,int age,int salary){
			this.name=name;
			this.age=age;
			this.salary=salary;
		}
		public String toString() {
			return name+" "+age+" "+salary;
		}
		public int compareTo(employe em2) {
		String	n1=this.name;
		String n2=em2.name;
		return n1.compareTo(n2);
       }
		
			
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
			
		}

