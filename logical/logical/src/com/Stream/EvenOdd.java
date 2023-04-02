package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
public class EvenOdd {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
List<Integer>evn=l.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(evn);
	List<Integer>od=l.stream().filter(e->!(e%2==0)).collect(Collectors.toList());
	List<Integer>od1=l.stream().filter(e->e%2==1).collect(Collectors.toList());
	System.out.println(od);
	System.out.println(od1);
	}

}
