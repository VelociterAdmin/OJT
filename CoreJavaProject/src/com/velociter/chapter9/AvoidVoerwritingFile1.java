package com.velociter.chapter9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvoidVoerwritingFile1 {
	public static void main(String[] args) throws IOException{
	    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	    String filepath=b.readLine();
	    
	    File aFile = new File(filepath);
	    
	    FileOutputStream outputFile = null;                // Stores the stream reference
	     if (aFile.isFile())
	     {
	     File newFile = aFile;                             
	                                                      
	     int i=100;
	     do
	     {
	     String name = aFile.getName();                   // Get the name of the file
	     int period = name.indexOf('.');                                  //  separator for the extension
	     newFile = new File(newFile.getParent(),name.substring(0, period) + i+ name.substring(period));
	     i++;
	     }
	     while(newFile.exists());                           // Stop when no such file exists
	     aFile.renameTo(newFile);                             // Rename the file
	     }
	                                                           // Now we can create the new file
	     try {
	                                                            // Create the stream opened to append data
	     outputFile = new FileOutputStream(aFile);
	     System.out.println(" output stream created");
	     } 
	     catch (FileNotFoundException e) {
	     e.printStackTrace(System.err);
	     }
	     System.exit(0);
	     }
	   }