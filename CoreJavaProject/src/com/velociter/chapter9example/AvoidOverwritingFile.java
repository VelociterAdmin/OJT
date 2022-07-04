package com.velociter.chapter9example;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
//example of chapter 9
// by this code you can avoid overwriting a file
  public class AvoidOverwritingFile {
    public static void main(String[] args) {
    	
    	
    String filepath = "H:\\newfolder2\\newfile.txt";
    
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
     newFile = new File(newFile.getParent(),name.substring(0, period) + "old"+ name.substring(period));
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