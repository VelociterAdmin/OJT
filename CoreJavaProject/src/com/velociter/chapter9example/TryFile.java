package com.velociter.chapter9example;     //accessing the directory and checking the given file does exist or not
import java.io.File;
public class TryFile {
	//chapter 9 example                                                   
    public static void main(String[] args) {
                                                    // Create an object that is a directory
       File myDir = new File("F:\\camera");
       System.out.println(myDir + (myDir.isDirectory() ? " is" : " is not")+ " a directory.");
                                                          // Create an object that is a file
       File myFile = new File(myDir,"IMG_20190523_121204.jpg");
       
       System.out.println(myFile + (myFile.exists() ? " does" : " does not")+ " exist");
       
       System.out.println(myFile + (myFile.isFile() ? " is" : " is not")+ " a file.");
       
       System.out.println(myFile + (myFile.isHidden() ? " is" : " is not")+ " hidden");
       
       System.out.println("You can" + (myFile.canRead() ? " " : "not ")+ "read " + myFile);
       
       System.out.println("You can" + (myFile.canWrite() ? " " : "not ")+ "write " + myFile);
       return;
 }
}