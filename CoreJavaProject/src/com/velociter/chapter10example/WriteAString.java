package com.velociter.chapter10example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

//chapter 10th example
//code to write a string in a file. if file do not exist then create it and write the string.
public class WriteAString {
	public static void main(String[] args) throws IOException {
		String phrase = new String("hello world\n");
		String dirname = "C:/Beg Java Stuff";                                         // Directory name
		String filename = "charData.txt";                                             // File name
		File dir = new File(dirname);                                                 // File object for directory
		                                                    // Now check out the directory
		if (!dir.exists()) {                                                         // If directory does not exist
			if (!dir.mkdir()) {                                                      // ...create it
				System.out.println("Cannot create directory: " + dirname);
				System.exit(1);
			}
		} else if (!dir.isDirectory()) {
			System.err.println(dirname + " is not a directory");
			System.exit(1);
		}
		                                                                          // Create the filestream
		File aFile = new File(dir, filename);                                       // File object for the file path
		FileOutputStream outputFile = null;                                         // Place to store the stream reference
		try {
			ResourceBundle bundle=ResourceBundle.getBundle("Switch");
			boolean b;
			
			int hashCodeOfKey;
			int hashCodeOfString;
			hashCodeOfKey=bundle.getString("switch").hashCode();
			hashCodeOfString="true".hashCode();
			if(hashCodeOfKey==hashCodeOfString) 
			{
			  	b=true;
			  	outputFile = new FileOutputStream(aFile,b);
			}
			else {
				b=false;
				
			}
			outputFile = new FileOutputStream(aFile,b);
			System.out.println("File stream created successfully.");
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
		}
		                                                                 // Create the file output stream channel and the buffer
		FileChannel outChannel = outputFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(1024);
		System.out.println("New buffer: position = " + buf.position() + "\tLimit = " + buf.limit() + "\tcapacity = "+ buf.capacity());
		                                                                  // Load the data into the buffer
		for (char ch : phrase.toCharArray()) {
			buf.putChar(ch);
		}
		System.out.println("Buffer after loading: position = " + buf.position() + "\tLimit = " + buf.limit()
				+ "\tcapacity = " + buf.capacity());
		buf.flip();                                                       // Flip the buffer ready for file write
		System.out.println("Buffer after flip: position = " + buf.position() + "\tLimit = " + buf.limit()
				+ "\tcapacity = " + buf.capacity());
		                                                                  // Write the file
		try {
			outChannel.write(buf);                                         // Write the buffer to the file channel
			outputFile.close();                                            // Close the O/P stream & the channel
			System.out.println("Buffer contents written to file.");
		} catch (IOException e) {
			e.printStackTrace(System.err);
		}
		System.exit(0);
	}
}