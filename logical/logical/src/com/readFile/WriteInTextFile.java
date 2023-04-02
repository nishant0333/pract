package com.readFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFile {

	public static void main(String[] args) throws Exception {
		FileWriter fileWriter=new FileWriter("F:\\writetxt.txt");
		
		BufferedWriter bw=new BufferedWriter(fileWriter);
		
		bw.write("hi i am nishant");
		bw.newLine();//for writing in next line
		bw.write("writinting text file");
		
		System.out.println("finish!!!!!");
		bw.close();

	}

}
