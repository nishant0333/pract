package com.logical;
class S{
	private S(){}
	static S s1;
	static{
		s1=new S();
	}
	static S getS() {
		return s1;
	}
	void m1() {
		System.out.println("m1 in S");
	}
}
public class singaltonA {

	public static void main(String[] args) {
		S s2=S.getS();
		S s3=S.getS();
		//S s4=new S();
		s2.m1();
System.out.println(s2==s3);
	}

}
