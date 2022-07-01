package com.velociter.chapter9example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class GuaranteeAFile {
//chapter 9 example
//You could guarantee a file is available with the following code.And if it is not available code will create a file by the given name 
	public static void main(String[] args) throws IOException {
		String filename="G:\\Temp\\TxGameDownload\\Component";
		File aFile = new File(filename);                   // Create the File object
		if(aFile.isDirectory())                            // Verify the path is a file
		{
			System.out.println("the path "+aFile.getPath()+" is a directory. and it does not contain any file");
			System.exit(1);
			
		}
		if(!aFile.isFile())                                // If the file doesn’t exist
		{
		    System.out.println(aFile=aFile.getAbsoluteFile());                 // Check the parent directory
			System.out.println(aFile.getName());
			File parentDirectory =new File(aFile.getParent());
			if(!parentDirectory.exists())
			{
				parentDirectory.mkdirs();
			}
		}
		FileOutputStream outputFile=null;
	
	try {
		outputFile = new FileOutputStream(aFile,true);
	}
	catch (FileNotFoundException e) {
		  e.printStackTrace(System.err);
		//System.out.println(e);
		}
		System.exit(0);
		}
	
	}