package com.velociter.chapter9example;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

  public class AvoidOverwritingFile {
    public static void main(String[] args) {
    	
    String filepath = "C:/Beg Java Stuff/myFile.txt";
    
    File aFile = new File(filepath);
    
    FileOutputStream outputFile = null;                // Stores the stream reference
     if (aFile.isFile())
     {
     File newFile = aFile;                             // Start with the original file
     
     }
    }
  }