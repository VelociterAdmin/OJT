package com.velociter.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AvoidOverwritingFileNum {
	 public static void main(String[] args) {
		   String filepath = "H:\\newfolder2\\Java.txt";

		 //  if(args.length>0)                            
		 //    filepath = args[0];                        
		     
		   File aFile = new File(filepath);
		   FileOutputStream outputFile = null;         
		   if (aFile.isFile()) {
		     File newFile = aFile;                      

		  
		  
		     do {
		       String name = newFile.getName();         
		       int period =  name.indexOf('.');        
		       if(period == -1)                         
		         newFile = new File(newFile.getParent(), extendName(name));    
		       else 
		         newFile = new File(newFile.getParent(), 
		                          extendName(name.substring(0, period)) 
		                          + name.substring(period));
		     } while (!aFile.renameTo(newFile));   // Stop when renaming works
		   } 

		   // Now we can create the new file
		   try {

		     // Create the stream opened to append data
		     outputFile = new FileOutputStream(aFile);
		     System.out.println(aFile.getName()+" output stream created");
		   } catch (FileNotFoundException e) {
		     e.printStackTrace(System.err);
		   } 
		   System.exit(0);
		 }

		 public static String extendName(String name) {
		   StringBuffer newName = new StringBuffer(name);             
		   String digits = newName.substring(newName.length()-3,newName.length()); 
		   int number = 0;
		   try {
		     number = Integer.parseInt(digits);                                   
		     ++number;                                                             
		     newName.delete(newName.length()-3,newName.length());
		     System.out.println(digits);
		   } catch(NumberFormatException nfe) {                                  
		   
		   }
		   digits = String.valueOf(number);                // Get number as a string 
		   assert digits.length() < 4;                          
		  
		 
		   return newName.append("000").replace(newName.length()-digits.length(),newName.length(), digits).toString();    
		 }
		}
