package com.jtc.Array;

public class ArrayTwoD {
public static void main(String[] arg) {
	int [][] a= {{10,20,30},{40,50,60}};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
