package collectiondemo;

import java.util.*;
import java.util.stream.Collectors;
class test{
public static void main(String[] args) {
List<Integer>l=Arrays.asList(1,2,2,2,3,3,3,4,4,4,5,5,5,6,7);
Set<Integer> s=new HashSet();
Set<Integer>sd=l.stream().filter(e->(s.add(e)==false)).collect(Collectors.toSet());
System.out.println(sd);
Map<Integer,Long>m1=l.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
System.out.println(m1);
}}
