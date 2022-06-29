package com.velociter.chapter9example;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;                       // For the Date class
//chapter 9 example
//it filters the files
	public class TryFile3 {
	public static void main(String[] args) {
	                                               // Create an object that is a directory
	 File myDir = new File("F:\\Training\\OJT\\CoreJavaProject\\src\\com\\velociter\\chapter6example");
	 System.out.println(myDir.getAbsolutePath()+ (myDir.isDirectory() ? " is " : " is not "+ "a directory"));
	 System.out.println("The parent of " + myDir.getName() + " is "	+ myDir.getParent());
	                                                     // Define a filter for java source files beginning with F
	 FilenameFilter select = new FileListFilter("C", "java");
	                                                      // Get the contents of the directory
	 File contents[] = myDir.listFiles(select);
	                                                       // List the contents
	 if (contents != null) {
	 System.out.println("/nThe "+contents.length+" matching items in the directory, "+ myDir.getName() +", are:");
	   for (File file : contents) {
	   System.out.println(file+" is a "+ (file.isDirectory() ? "directory" : "file")+ " last modified on\n"+ new Date(file.lastModified()));
	   }
	   } else {
	   System.out.println(myDir.getName() + " is not a directory");
	   }
	  return;
	 }
}