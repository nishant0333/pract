package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
class employ implements Comparable<employ>{
	int id;
	String name;
	int salary;
	employ(int id,String name,int salary){
		this.id=id;
		this.salary=salary;
		this.name=name;
		}
	public String toString() {
		
		return id+"-"+name+"-"+salary;
	}

	@Override
	public int compareTo(employ o2) {
		// TODO Auto-generated method stub
		int s1=this.salary;
		int s2=o2.salary;
		if(s1<s2) {
		return -1;	
		}else if(s1>s2){
			return +1;
		}
		return 0;
	}

} 
public class mapfilter {

	public static void main(String[] args) {
		List<employ>e=Arrays.asList(
				new employ(1,"ram",1500),
				new employ(2,"mohan",2000),
				new employ(3,"gita",2500),
				new employ(4,"sohan",3000),
				new employ(5,"sita",3500)
				);
			List<employ> emp=e.stream()
					.filter(a->a.salary>2000).collect(Collectors.toList());
	        System.out.println(emp);
	        
	        List<String> emp1=e.stream()
	        		.filter(a->a.salary>2000).map(r->r.name)
	        		.collect(Collectors.toList());
	        System.out.println(emp1);
	        
	        //Optional<Integer>max=e.stream().sorted().max((v1,v2)->{return v1.compareTo(v2);});
	        //System.out.println(emp1);
	}

}
