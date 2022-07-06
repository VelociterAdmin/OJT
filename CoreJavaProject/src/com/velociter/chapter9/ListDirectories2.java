package com.velociter.chapter9;

import java.io.File;
import java.io.FileFilter;
public class ListDirectories2 {
	public static void main(String[] args) {
	  File myDir = new File("C:");                                                                // Create an object that is a directory
	  
   // FileFilter select = new ListDirectory(" ");                                                    // Define a filter for java source files beginning with C
                                                                                                     
    File contents[] = myDir.listFiles();                                                       // Get the contents of the directory
                                                                                                     
    if (contents != null) {                                                                           // List the contents
    System.out.println("\nThe "+contents.length+" matching items in the directory, "+ myDir.getName() +", are:");

    for (File file : contents)
     {
       System.out.println(file+" is a "+ (file.isDirectory() ? "directory" : "file"));
     }
     }
    else
     {
       System.out.println(myDir.getName() + " is not a directory");
     }
    return;
    }
  }

