package com.velociter.chapter9;
import java.io.BufferedReader;
//6 Example of chapter 9
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class AvoidOverwrittenExample {
   public static void main(String[] args) {

	    String filepath = "F:\\File Accessing\\ByteDemo.java";
		File aFile = new File(filepath);
		FileOutputStream outputFile = null;              // Stores the stream reference
		if (aFile.isFile()) {
		File newFile = aFile;
		// Append "old" to the file name
		do {
			String name = newFile.getName();              // Get the name of the file
			int period = name.indexOf('.');  // Find the separator for the extension
			newFile = new File(newFile.getParent(),name.substring(0, period) +"odd"+name.substring(period));
			}
			while(newFile.exists());                     // Stop when no such file exists
			aFile.renameTo(newFile);                      // Rename the file
		}
			// Now we can create the new file
			try {
			// Create the stream opened to append data
			outputFile = new FileOutputStream(aFile);
			System.out.println("myFile.txt output stream created");
			} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			}
			System.exit(0);
			}
	}
