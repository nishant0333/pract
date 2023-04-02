package com.readFile;

import java.io.File;
import java.util.Scanner;

public class ReadFileUsingScannerClass {

	public static void main(String[] args) throws Exception {
		File file = new File("F:\\nishant.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) 
		{
			System.out.println(sc.nextLine());
		}
          
	}

}
