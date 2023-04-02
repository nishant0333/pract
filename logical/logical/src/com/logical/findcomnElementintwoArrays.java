package com.logical;

import java.util.HashSet;

public class findcomnElementintwoArrays {
	public static void main(String[] args) {
		int a[]= {1,2,34};
		int b[]= {1,2,35};
		
		HashSet h=new HashSet<>();
		
		for(Integer i:a) {
			h.add(i);
		}
		for(Integer i1:b) {
			if(h.add(i1)==false) {
				System.out.println(i1);
			}
		}
	}		
}
