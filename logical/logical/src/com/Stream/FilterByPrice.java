package com.Stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//class product{
//int id;
//String brand;
//int price;
//product(int id,String brand,int price){
//	this.id=id;
//	this.brand=brand;
//	this.price=price;	
//}
//public String toString() {
//	return id+"-"+brand+"-"+price;
//}
//}
public class FilterByPrice {
    public static void main(String[] args) {
	List<Integer>l=Arrays.asList(1,2,2,3,3,5,6,2,2,2);	
//	Set<Integer> s=new HashSet<Integer>();
//	Set<Integer>s2=l.stream().filter(e->!(s.add(e))).collect(Collectors.toSet());
//   System.out.println(s2);
	//---------------------------or----------------
 List<Integer>I =  
	l.stream().filter(e->Collections.frequency(l, e)>0).collect(Collectors.toList());
    System.out.println(I);
	}
    }
