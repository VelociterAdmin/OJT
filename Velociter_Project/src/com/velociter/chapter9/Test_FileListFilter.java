package com.velociter.chapter9;

import java.io.File;
import java.util.Date;
import java.io.FilenameFilter;


public class Test_FileListFilter {

	public static void main(String[] args) {
		//create object of File class
		File myDir=new File("D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter2");
		System.out.println(myDir.getAbsolutePath()+(myDir.isDirectory()?"is":"is not"+"a directory"));
		System.out.println("The parents of"+ myDir.getName()+"is"+myDir.getParent());
		//Define a filter 
		FilenameFilter select= new FileListFilter("A","java");
		// Get the contents of the directory
		File contents[]= myDir.listFiles(select);
		if(contents !=null) {
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
		
