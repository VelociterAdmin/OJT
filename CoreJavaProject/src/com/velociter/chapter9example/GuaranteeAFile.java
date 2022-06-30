package com.velociter.chapter9example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class GuaranteeAFile {
//chapter 9 example
//You could guarantee a file is available with the following code.And if it is not available code will create a file by the given name 
	public static void main(String[] args) {
		String filename="F:\\Training\\OJT\\CoreJavaProject\\src\\com\\velociter\\chapter2\\Hello.java";
		File aFile = new File(filename);                   // Create the File object
		if(aFile.isDirectory())                            // Verify the path is a file
		{
			System.out.println("the path "+aFile.getPath()+" does not specify a file. Program aborted.");
			System.exit(1);
			
		}
		if(!aFile.isFile())                                // If the file doesn’t exist
		{
			aFile=aFile.getAbsoluteFile();                 // Check the parent directory
		//	System.out.println(aFile.getName());
			File parentDirectory =new File(aFile.getParent());
			if(!parentDirectory.exists()) {
				parentDirectory.mkdir();
			}
		}
		FileOutputStream outputFile=null;
	
	try {
		outputFile = new FileOutputStream(aFile, true);
	}
	catch (FileNotFoundException e) {
		  e.printStackTrace(System.err);
		//System.out.println(e);
		}
		System.exit(0);
		}
	
	}