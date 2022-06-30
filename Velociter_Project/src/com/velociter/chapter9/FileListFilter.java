package com.velociter.chapter9;
//Example of chapter 9

import java.io.File;
import java.io.FilenameFilter;
public class FileListFilter implements FilenameFilter{
	private String name;
	private String extension;
	
	//create parameterized constructor
	public FileListFilter(String name,String extension) {
		this.name=name;
		this.extension=extension;
	}

	//override the method
	public boolean accept(File directory, String filename) {
		boolean fileOK=true;  
		if(name !=null) {          //if condition is true 
			fileOK &=filename.startsWith(name);        
		}
		if(extension !=null) {
			fileOK &=filename.endsWith("."+extension);
		}
		
		return fileOK;
	}
	

}
