package com.velociter.chapter9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListDirectories implements FileFilter{
	public static StringBuffer space = new StringBuffer();

	  public static void main(String[] args) throws IOException {
	    File[] roots = null;
	    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	    String filepath=b.readLine();
	                        
	      File directory = new File(filepath);
	      if(directory.isDirectory()) {                   // If it is a directory
	        roots = new File[1];                          // then store it ready for listing
	        roots[0] = directory;
	      } else {                                        
	        System.out.println(directory.getName()+" is not a directory");
	        System.exit(1);
	      }
	  
	                              
	    ListDirectories lister = new ListDirectories();    // Create object to do the listing
	    for(int count = 0 ; count<roots.length ; count++)              // and list all the directories
	      lister.listDirectories(roots[count]);
	  }

	  // Lists directories recursively with each subdirectory level with spaces
	  public void listDirectories(File rootDirectory) {
	    String name = rootDirectory.getName();
	    if(name.length()==0)                              
	      name = rootDirectory.getPath();                  
	    System.out.println(space.toString()+name);       
	    space.append("  ");                               
	    File[] fileList = rootDirectory.listFiles(this); 
	    
	    if(fileList != null)                              
	      for(int count = 0 ; count<fileList.length ; count++)         
	        listDirectories(fileList[count]);
            
	    space.delete(space.length()-2, space.length()); 
	    return;                                            
	  }

	  // Filter method to only accept directories
	  public boolean accept(File file) {
	    return file.isDirectory();
	  }
}
