package com.jtc.Array;

public class ArrayThreeD {
public static void main(String[] arg) {
	int [][][] a= {{{10,20,30,40,50},{11,12,13,14}},{{44,45,46},{34,35,36}}};

	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			
			for(int k=0;k<a[i][j].length;k++) {
				
				System.out.print(a[i][j][k]+" ");
			}
			System.out.println();
		}
	}
}
}
