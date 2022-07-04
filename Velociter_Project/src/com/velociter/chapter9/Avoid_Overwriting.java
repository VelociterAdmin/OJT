package com.velociter.chapter9;
//1 Exercise question:
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Avoid_Overwriting {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String filepath=reader.readLine();
			File aFile = new File(filepath);
			FileOutputStream outputFile = null;              // Stores the stream reference
			if (aFile.isFile()) {
			File newFile = aFile;
			// Append "old" to the file name
			do {
				String name = newFile.getName();              // Get the name of the file
				int period = name.indexOf('.');               // Find the separator for the extension
				newFile = new File(newFile.getParent(),name.substring(0, period) + "old"+ name.substring(period));
				} while(newFile.exists());                    // Stop when no such file exists
				aFile.renameTo(newFile);                      // Rename the file
				}
				
				try {
			    // Now create the new file
				outputFile = new FileOutputStream(aFile);
				System.out.println("myFile.txt output stream created");
				} catch (FileNotFoundException e) {
				e.printStackTrace(System.err);
				}
				System.exit(0);
				}
		}	


