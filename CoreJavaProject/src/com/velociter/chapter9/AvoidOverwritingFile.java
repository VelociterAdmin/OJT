package com.velociter.chapter9;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.FileNotFoundException;
//example of chapter 9
// by this code you can avoid overwriting a file
  public class AvoidOverwritingFile {
	  
    public static void main(String[] args) throws IOException{
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String filepath=b.readLine();
    
    File aFile = new File(filepath);
    
    FileOutputStream outputFile = null;                // Stores the stream reference
     if (aFile.isFile())
     {
     File newFile = aFile;                             
                                                       // Add “_old” to the file name
     do
     {
     String name = newFile.getName();                   // Get the name of the file
     int period = name.indexOf('.');                                  //  separator for the extension
     newFile = new File(newFile.getParent(),name.substring(0, period) + "_old"+ name.substring(period));
     }
     while(newFile.exists());                           // Stop when no such file exists
     aFile.renameTo(newFile);                             // Rename the file
     }
                                                           // Now we can create the new file
     try {
                                                            // Create the stream opened to append data
     outputFile = new FileOutputStream(aFile);
     System.out.println("abc.txt output stream created");
     } 
     catch (FileNotFoundException e) {
     e.printStackTrace(System.err);
     }
     System.exit(0);
     }
   }