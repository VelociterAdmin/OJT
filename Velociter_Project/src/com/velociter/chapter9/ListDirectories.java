package com.velociter.chapter9;
// 3 Exercise question of chapter 9
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class ListDirectories implements FileFilter{
	 private static StringBuffer indent = new StringBuffer();

	  public static void main(String[] args) {
		 
	    File[] roots = null;

	    if(args.length>0) {                               // Check for command line argument                            
	      File directory = new File(args[0]);
	      if(directory.isDirectory()) {                   // If it is a directory
	        roots = new File[1];                          // then store it ready for listing
	        roots[0] = directory;
	      } else {                                        // otherwise issue message and bail out
	        System.out.println(directory.getName()+" is not a directory");
	        System.exit(1);
	      }
	    
	    }
	   
	    else                                               // If no command line argument
	      roots = File.listRoots();     // get the system roots
	                              
	    ListDirectories lister = new ListDirectories();    // Create object to do the listing
	    for(int count = 0 ; count<roots.length ; count++)              // and list all the directories
	      lister.listDirectories(roots[count]);
	  }
	  

	  // Lists directories recursively with each subdirectory level indented two spaces
	  private void listDirectories(File rootDirectory) {
	    String name = rootDirectory.getName();
	    if(name.length()==0)                              
	      name = rootDirectory.getPath();                  
	    System.out.println(indent.toString()+name);       
	    indent.append("  ");                               
	    File[] fileList = rootDirectory.listFiles(this);   
	    if(fileList != null)                              
	      for(int count = 0 ; count<fileList.length ; count++)         
	        listDirectories(fileList[count]);
    
	    indent.delete(indent.length()-2, indent.length()); 
	    return;                                            
	  }

	  // Filter method to only accept directories
	  public boolean accept(File file) {
	    return file.isDirectory();
	  } 
	  

	}



	

