package com.velociter.chapter9;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

public class TryFile2 {

	public static void main(String[] args) {
		// Create an object that is a directory
		File myDir = new File("D:\\Training\\OJT\\Velociter_Project\\src\\com");
		System.out.println(myDir.getAbsolutePath()+ (myDir.isDirectory() ? " is " : " is not ")	+ "a directory");
		System.out.println("The parent of "+ myDir.getName() + " is "+ myDir.getParent());//get the directory name
		// Get the contents of the directory
		File[] contents = myDir.listFiles();
		// List the contents of the directory
			if (contents != null) {
				System.out.println("\n The " + contents.length+ " items in the directory " + myDir.getName()+ " are:");
			for (File file : contents) {
				//get the modified date
				System.out.println(file + " is a "+ (file.isDirectory() ? "directory" : "file")+ " last modified on:\n"+ new Date(file.lastModified()));
			}
				} else {
				System.out.println(myDir.getName() + "is not a directory");
				}
				System.exit(0);   //Indicates successful termination
			}
	}


