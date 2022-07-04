package com.velociter.chapter9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Test_ListDirectories {

	public static void main(String[] args)  {

		//BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//String pathname=reader.readLine();
	   File myDir=new File("F:\\new");
	   FileFilter select= new ListDirectories("F:\\new");
		// Get the contents of the directory
		File contents[]= myDir.listFiles();      
		if(contents !=null) {
			System.out.println("\nThe " + contents.length+ " items in the directory " + myDir.getName()+ " are:");
			for (File file : contents) {
				
				System.out.println(file + " is a "+ (file.isDirectory() ? "directory" : "file"));
			}
				} 
		else {
				System.out.println(myDir.getName() + "is not a directory");
				}
				System.exit(0);   //Indicates successful termination
			}
	}


