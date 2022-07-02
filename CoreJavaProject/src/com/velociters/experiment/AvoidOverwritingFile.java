package com.velociters.experiment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//example of chapter 9
// by this code you can avoid overwriting a file.and add number after the file name to differentiate between files
  public class AvoidOverwritingFile {
    public static void main(String[] args) throws IOException {
    	
     //   BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
     //   String filepath=b.readLine();
    String filepath="D://New folder//file.txt";
    File aFile = new File(filepath);
    
    FileOutputStream outputFile = null;                // Stores the stream reference
     if (aFile.isFile())
     {
     File newFile = aFile;                             
                                                      
     int i=000;
     do
     {
     i++;
     String name = newFile.getName();                   // Get the name of the file
     int period = name.indexOf('.');                                  //  separator for the extension
     newFile = new File(newFile.getParent(),name.substring(0, period) +i+ name.substring(period));
     
     }
     while(newFile.exists());                           // Stop when no such file exists
     aFile.renameTo(newFile);                             // Rename the file
     }
     String extendName(String name) {
    	 StringBuffer newName=new StringBuffer(name);
    	 String digits= newName.substring(newName.length()-3,newName.length());
    	 int number=0;
     
     }                                                  // Now we can create the new file
     try {
                                                            // Create the stream opened to append data
     outputFile = new FileOutputStream(aFile);
     System.out.println("output stream created");
     } 
     catch (FileNotFoundException e) {
     e.printStackTrace(System.err);
     }
     System.exit(0);
     }
   }