package com.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class employee12{
	String name;
	int age;
	int salary;
	
	employee12(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String toString() {
		return name+" "+age+" "+salary;
	}
	public int compareTo(employee12 em2) {
	Integer	n1=this.age;
	Integer n2=em2.age;
	return -n1.compareTo(n2);
		
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

public class employee_Test {

	public static void main(String[] args) {
		List<employee12> e=new ArrayList<>();
		e.add(new employee12("ganesh",22,10000));
		e.add(new employee12("kumar",23,11000));
		e.add(new employee12("kumar",27,11000));
		e.add(new employee12("kumar",25,14000));
		e.add(new employee12("mohan",24,12000));
		
		List<employee12>e12=e.stream()
				.filter(g->g.name.equals("kumar") && g.salary>10000)
				.collect(Collectors.toList());
	             System.out.println(e12);
	
	             System.out.println(); 
	          
	Collections.sort(e12,(a,b)->(a.age<b.age)?-1:(a.age>b.age)?1:0);
	             System.out.println(e12);
	
	System.out.println(";;;;;;;;;;;find maxsalary on salary;;;;;;;;;;;");
	             System.out.println();
	  
	Optional<Integer>maxsalary=e.stream().map(r->r.salary)
			.sorted(Comparator.reverseOrder()).findFirst();
	System.out.println(maxsalary.get());
	
	System.out.println(".............find maximum salary and employee obj..............."); 
	              System.out.println(); 
	              
Collections.sort(e,(t1,t2)->(t1.salary<t2.salary)?1:(t1.salary>t2.salary)?-1:0);
System.out.println(e);

                      System.out.println();

Optional<employee12>ms=e.stream().findFirst();
System.out.println(ms.get());

System.out.println("////////filter and sorting on single condition and get employee object//////////");
          System.out.println();
          
          
    List<employee12>e15=e.stream()
    .filter(g->g.name.equals("kumar") && g.salary>10000)
    .sorted((a,b)->{return -((Integer)a.salary).compareTo(b.salary);})
    .collect(Collectors.toList());
	 System.out.println("e15"+e15);
	
	                                //OR
	
	System.out.println("OR  Ascending ");
	            System.out.println();
	            
	List<employee12> e16 = e.stream()
			.filter(g->g.name.equals("kumar") && g.salary>10000)
			.sorted(Comparator.comparing(employee12::getSalary))
			.collect(Collectors.toList());
      System.out.println("e16"+e16);
      
                                    //OR
      System.out.println("OR   Descending ");
                     System.out.println();
                     
  	List<employee12> e17 = e.stream()
  			.filter(g->g.name.equals("kumar") && g.salary>10000)
  			.sorted(Comparator.comparing(employee12::getSalary).reversed())
  			.collect(Collectors.toList());
        System.out.println("e17"+e17);
        
                                      //OR
        
        System.out.println("OR      Descending");
                    System.out.println();
                    
    	List<employee12> e18 = e.stream()
    			.filter(g->g.name.equals("kumar") && g.salary>10000)
    			.sorted(Comparator.comparing(emp->((employee12)emp).getSalary()).reversed())
    			.collect(Collectors.toList());
          System.out.println("e18"+e18);
      
	
	System.out.println(".......filter and get single object.......");
	              System.out.println();
	              
	employee12 e19=e.stream()
			.filter(g->g.name.equals("kumar") && g.salary>10000)
			.sorted((a,b)->{return -((Integer)a.salary).compareTo(b.salary);})
			.findFirst().get();
				System.out.println(e19);
				
				    
				
				
	              
	System.out.println(".............sorting on two condition...........");
	                  System.out.println();
	
	Comparator<employee12> c= (em1,em2)->{
		Integer i1=em1.salary;
		Integer i2=em2.salary;
		if(i1<i2)  return 1;
		else if (i1>i2) return -1;
		else return em1.compareTo(em2);
			};
	
			List<employee12>e23=e.stream()
					.filter(r->r.name.equals("kumar")&& r.salary>10000)
					.sorted(c).collect(Collectors.toList());
			System.out.println(e23);
	}
}
