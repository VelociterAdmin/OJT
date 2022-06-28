package com.velociter.chapter9example;
import java.io.File;
public class TryFile {
public static void main(String[] args) {
                                                    // Create an object that is a directory
File myDir = new File("F:/Training/OJT/CoreJavaProject/src/com/velociter/chapter4");
System.out.println(myDir + (myDir.isDirectory() ? " is" : " is not")+ " a directory.");
                                                          // Create an object that is a file
File myFile = new File(myDir,"DislpayMonthAndDecimal.java");
System.out.println(myFile + (myFile.exists() ? " does" : " does not")+ " exist");
System.out.println(myFile + (myFile.isFile() ? " is" : " is not")+ " a file.");
System.out.println(myFile + (myFile.isHidden() ? " is" : " is not")+ " hidden");
System.out.println("You can" + (myFile.canRead() ? " " : "not ")+ "read " + myFile);
System.out.println("You can" + (myFile.canWrite() ? " " : "not ")+ "write " + myFile);
return;
 }
}