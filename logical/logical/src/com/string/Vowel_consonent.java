package com.string;

public class Vowel_consonent {
	public static void main(String args[]) {
	      String s = "annavegai";
	      int count1=0;
	      int count2=0;
	      String s1="";
	      String s2="";
	      for(int i=0;i<s.length();i++) {
	    	  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
	    		 s1=s1+s.charAt(i); 
	    		 count1++; 
	    	  }else {
	    		  s2=s2+s.charAt(i);
				count2++;
			}
	      }
	      System.out.println(s1+" : "+count1);
	      System.out.println(s2+" : "+count2);
	  
	   }
}
