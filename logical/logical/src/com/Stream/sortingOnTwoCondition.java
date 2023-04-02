package com.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


class employee15 {
	String name;
	int age;
	int salary;
	
	employee15(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public String toString() {
		return name+" "+age+" "+salary;
	}
	
	public int compareTo(employee15 em3) {
	Integer	n1=this.age;
	Integer n2=em3.age;
	return -n1.compareTo(n2);	
	}
		
	}


public class sortingOnTwoCondition {

	public static void main(String[] args) {
		
		
		List<employee15> e=new ArrayList<>();
		
		e.add(new employee15("mohan",22,10000));
		e.add(new employee15("kumar",23,11000));
		e.add(new employee15("kumar",27,11000));
		e.add(new employee15("kumar",25,14000));
		e.add(new employee15("jha",24,12000));

		
		Comparator<employee15> c= (em1,em2)->{
			Integer i1=em1.salary;
			Integer i2=em2.salary;
			if(i1<i2)  return 1;
			else if (i1>i2) return -1;
			else return em1.compareTo(em2);
				};
		
				List<employee15>e15=e.stream().filter(r->r.name.equals("kumar")&& r.salary>10000).sorted(c).collect(Collectors.toList());
				System.out.println(e15);
	}

}
