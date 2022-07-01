package com.velociter.chapter9;
//5 Example of chapter 9
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExist {

	public static void main(String[] args) throws FileNotFoundException {
		String filename="F:\\File Accessing\\Chapter9\\Chapter\\Abc.java";
		//create the object of File class
		File aFile=new File(filename);
		// Verify the path is a file
		if(aFile.isDirectory()) {
			System.out.println("The path"+aFile.getPath()+"is directory.");
			System.exit(1);           //termination unsuccessful
		}
		//if file does not exists
		if(!aFile.isFile()) {
			System.out.println(aFile=aFile.getAbsoluteFile());
			System.out.println(aFile.getName());
			File parentDir=new File(aFile.getParent());
			//check the parent directory if not exist
			if(!parentDir.exists()) {   
				parentDir.mkdir();      //create new directory
			}
		}
	FileOutputStream outputFile=null;    // store the stream reference
	try {
	outputFile=new FileOutputStream(aFile);
	}catch(FileNotFoundException e) {
		
	}
	
	}
}

