package com.velociter.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileExist {

	public static void main(String[] args) throws FileNotFoundException {
		String filename="D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter2\\tem.java";
		File aFile=new File(filename);
		if(aFile.isDirectory()) {
			System.out.println("The path"+aFile.getPath()+"does not specify a file. Program aborted");
			System.exit(1);
		}
		if(!aFile.isFile()) {
			System.out.println(aFile=aFile.getAbsoluteFile());
			System.out.println(aFile.getName());
			File parentDir=new File(aFile.getParent());
			if(!parentDir.exists()) {
				parentDir.mkdir();
			}
		}
	FileOutputStream outputFile=null;
	try {
	outputFile=new FileOutputStream(aFile,true);
	}catch(FileNotFoundException e) {
		
	}
	
	}
}

