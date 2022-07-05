package com.velociter.chapter9;
// 3 Exercise question of chapter 9
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListDirectorie implements FileFilter{
    public static StringBuffer buffer = new StringBuffer();
     public static void main(String[] args) throws IOException {
		    File[] roots = null;  
		    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		    String filepath=reader.readLine();
		      File directory = new File(filepath);
		      if(directory.isDirectory()) {                   // If it is a directory
		        roots = new File[1];                          // then store it ready for listing
		        roots[0] = directory;
		      } else {                                        
		        System.out.println(directory.getName()+" is not a directory");
		        System.exit(1);
		      }
		   
		                             
		    ListDirectorie lister = new ListDirectorie();            // Create object to do the listing
		    for(int count = 0 ; count<roots.length ; count++)         //  list all the directories
		      lister.listDirectories(roots[count]);
		  }

		  // Lists directories recursively with each subdirectory level indented two spaces
		public void listDirectories(File rootDirectory) {
		    String name = rootDirectory.getName();
		    if(name.length()==0)                              
		      name = rootDirectory.getPath();                  
		    System.out.println(buffer.toString()+name);      
		    buffer.append("  ");                              
		    File[] fileList = rootDirectory.listFiles(this);  
		    if(fileList != null)                              
		      for(int count = 0 ; count<fileList.length ; count++)        
		        listDirectories(fileList[count]);

		    buffer.delete(buffer.length()-2, buffer.length());
		    return;                                            
		  }

		  // Filter method to only accept directories
		  public boolean accept(File file) {
		    return file.isDirectory();
		  }

	}

	

