package com.logical;
import java.util.*;
public class DupliSet {
public static void main(String[] args){
int []a={3,2,5,4,2,4,3,1};
System.out.println("Duplicate element is :");
Set<Integer> s=new HashSet<>();
for(int no:a){
if(s.add(no)==false){
System.out.println(no+" ");
}
}
}
}