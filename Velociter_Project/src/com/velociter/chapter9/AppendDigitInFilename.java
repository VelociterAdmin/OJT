package com.velociter.chapter9;
//2 Exercise question:
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AppendDigitInFilename {

	public static void main(String[] args) {
		 String filepath = "F:\\File Accessing\\Chapter9.txt";
			File aFile = new File(filepath);
			FileOutputStream outputFile = null;              // Stores the stream reference
			if (aFile.isFile()) {
			File newFile = aFile;
			
			int i=100;
			do {
				String name = aFile.getName();              // Get the name of the file
				int period = name.indexOf('.');              // Find the separator for the extension
				newFile = new File(newFile.getParent(),name.substring(0, period) + i +name.substring(period));
				i++;
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


