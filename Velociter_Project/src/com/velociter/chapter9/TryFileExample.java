package com.velociter.chapter9;

import java.io.File;

public class TryFileExample {

	public static void main(String[] args) {
		File myDir = new File("C:/Users/one/eclipse-workspace/Velociter_Project/src/com/velociter/chapter2");
		System.out.println(myDir + (myDir.isDirectory() ? " is ":" is not")+ " a directory");
		
		File myFile = new File(myDir,"AssignmentOperators.java");
		System.out.println(myFile + (myFile.exists() ? " does" : " does not")+ " exist");
		System.out.println(myFile + (myFile.isFile() ? " is " : " is not")+ " a file");
		System.out.println(myFile + (myFile.isHidden() ? " is " : " is not")+ " hidden");
		System.out.println("You can" + (myFile.canRead() ? "" : "not ")+ "read " + myFile);
		System.out.println("You can" + (myFile.canWrite() ? " ": "not ")+ " write" + myFile);
		return;
	
	}

}
