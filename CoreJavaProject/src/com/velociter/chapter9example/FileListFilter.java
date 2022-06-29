package com.velociter.chapter9example;
import java.io.File;
import java.io.FilenameFilter;
// chapter 9 example 
public class FileListFilter implements FilenameFilter {
    private String name;                                     // File name filter
    private String extension;                                // File extension filter
    
                                                             
    public FileListFilter(String name, String extension) {   // Constructor
    this.name = name;
    this.extension = extension;
    }
    
	                                                                      
    public boolean accept(File directory, String filename) {
    	boolean fileOK = true;
                                                              
      if (name != null) {                                      // If there is a name filter specified, check the file name
      fileOK &= filename.startsWith(name);
      }
                                                             
    if (extension != null) {                                   // If there is an extension filter, check the file extension
    fileOK &= filename.endsWith('.' + extension);
    }
    return fileOK;
    }
   }
