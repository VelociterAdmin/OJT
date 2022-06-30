package com.velociter.chapter9;

import java.io.File;
// 1 Example of chapter 9
public class TryFileExample {

	public static void main(String[] args) {
		//pass the path as a argument to the constructor of the file object
		File myDir = new File("D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter");
		System.out.println(myDir + (myDir.isDirectory() ? " is ":" is not")+ " a directory");//print directory is present or not.
		
		File myFile = new File(myDir,"AssignmentOperators.java"); 
		System.out.println(myFile + (myFile.exists() ? " does" : " does not")+ " exist");//print file is exist or not.
		System.out.println(myFile + (myFile.isFile() ? " is " : " is not")+ " a file"); //print file is present or not.
		System.out.println(myFile + (myFile.isHidden() ? " is " : " is not")+ " hidden");//print file is hidden or not.
		System.out.println("You can" + (myFile.canRead() ? "" : "not ")+ "read " + myFile);//read() used for read the file
		System.out.println("You can" + (myFile.canWrite() ? " ": "not ")+ " write" + myFile);//write()used for write in the file
		return;
	
	}

}
