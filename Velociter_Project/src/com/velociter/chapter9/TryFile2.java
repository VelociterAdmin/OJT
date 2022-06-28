package com.velociter.chapter9;

import java.io.File;
import java.sql.Date;

public class TryFile2 {

	public static void main(String[] args) {
		File myDir = new File("D:/Training/OJT/Velociter_Project/src/com/velociter");
		System.out.println(myDir.getAbsolutePath()+ (myDir.isDirectory() ? " is " : " is not ")	+ "a directory");
		System.out.println("The parent of "+ myDir.getName() + " is "+ myDir.getParent());
			// Get the contents of the directory
		File[] contents = myDir.listFiles();
			if (contents != null) {
				System.out.println("\nThe " + contents.length+ " items in the directory " + myDir.getName()+ " are:");
			for (File file : contents) {
				System.out.println(file + " is a "+ (file.isDirectory() ? "directory" : "file")+ " last modified on:\n"+ new Date(file.lastModified()));
			}
				} else {
				System.out.println(myDir.getName() + "is not a directory");
				}
				System.exit(0);
			}
	}


