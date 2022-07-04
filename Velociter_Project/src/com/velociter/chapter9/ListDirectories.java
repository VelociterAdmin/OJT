package com.velociter.chapter9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListDirectories implements FileFilter {
	
		  private String name;
		  
		 //create parameterized constructor
			public ListDirectories(String name) {
				this.name=name;
			}

			@Override
			public boolean accept(File pathname) {
			   return pathname.isDirectory() ;       
				
			}
}