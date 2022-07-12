package com.velociter.chapter10;
// 1 Example of Chapter 10;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {

	public static void main(String[] args) throws IOException {
		FileWriter File = new FileWriter("F:\\new.txt");     
	    BufferedWriter buffer=new BufferedWriter(File);
	    buffer.write(" ");
	    buffer.close();
	}
}
