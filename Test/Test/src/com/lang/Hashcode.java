package com.lang;
class Aa{
	String str1=new String("Aa");
	String str2=new String("BB");
	void show() {
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
	}
}
public class Hashcode {
	public static void main(String[] args) {
		Aa aa=new Aa();
	aa.show();
	}

}
