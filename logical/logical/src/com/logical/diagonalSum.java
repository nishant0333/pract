package com.logical;

import java.util.Arrays;
import java.util.List;
//find diagonal sum of three Arrays
public class diagonalSum {

	public static void main(String[] args) {
		List<Integer>i1=Arrays.asList(1,3,4);
		List<Integer>i2=Arrays.asList(2,4,3);
		List<Integer>i3=Arrays.asList(4,3,2);
		
		Integer a=i1.get(0)+i2.get(1)+i3.get(2);
		Integer b=i1.get(2)+i2.get(1)+i3.get(0);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a-b);

	}

}
