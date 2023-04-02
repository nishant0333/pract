package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class getSingleObject {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,4,5,6);
		
		List<Integer>l1=l.stream().filter(e->e==1).collect(Collectors.toList());
	System.out.println(l1);
	System.out.println(";;;;;;;;;;;;;;;;;;as an Object;;;;;;;;;;;;");
	Integer i1=l.stream().filter(e->e==1).findAny().get();
	System.out.println(i1);
	}

}
