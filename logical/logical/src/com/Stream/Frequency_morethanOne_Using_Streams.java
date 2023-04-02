package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Frequency_morethanOne_Using_Streams {
	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,1,1,2,4,5,6);
	Map<Integer,Long>r=l.stream()
			.collect(Collectors.groupingBy(e->e,Collectors.counting()));
	

	Set<Entry<Integer,Long>>r1=r.entrySet();
	
	System.out.println("-------------convenstional way--------");
	 for(Entry<Integer,Long> z:r1) {
		 if(z.getValue()>1) {
			 System.out.println(z);
		 }
	 }
	 
	 System.out.println("--------Directely print using forEach-----------");
	r1.stream().filter(q->q.getValue()>1).forEach(System.out::println);
	
	System.out.println("---------get as Set<Entry<Integer,long>>--------------");
	Set<Entry<Integer,Long>>t1=r1.stream().filter(q->q.getValue()>1)
			.collect(Collectors.toSet());
	System.out.println(t1);
	
	
	System.out.println("---------get as Map<Integer,Long>-------------");
	Map<Integer,Long>t2=r1.stream().filter(q->q.getValue()>1)
			.collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
	System.out.println(t2);
	
	}
}
