package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortBycompareto {
	public static void main(String[] args) {
		List<String>l1=Arrays.asList("aalok");
		List<String>l2=Arrays.asList("lalit");
		List<String>l3=Arrays.asList("mohan");
		List<List<String>>fl=Arrays.asList(l1,l2,l3);
		
		List<String>sl=fl.stream().flatMap(x->x.stream()).
		sorted((a,b)->{return a.compareTo(b);
		}).collect(Collectors.toList());
		System.out.println(sl);
	}		
}
