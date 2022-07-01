package com.velociter.chapter9example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//chapter 9 example
//creating files
public class CreatingFile {

	public static void main(String[] args) throws IOException {
	//	File tempFile = File.createTempFile("list", ".txt");
	//	tempFile.deleteOnExit();
		String name="H:\\newfolder3";
	    File file=new File(name);
	    file.mkdir();
		FileOutputStream outputFile = null;             // Place to store the stream reference
		try {
		
		outputFile = new FileOutputStream("H:\\newfolder3\\abc.txt");
		
		}
		catch(FileNotFoundException e) 
		{
		e.printStackTrace(System.err);
		}
     }
}
