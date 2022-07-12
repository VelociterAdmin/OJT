package com.velociter.chapter10;

// 5 Example of Chapter 10;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteAString {

	public static void main(String[] args) {
		String phrase = new String("Garbage in, garbage out\n");
		String dirname = "F:\\File Accessing\\Write";        // Directory name
		String filename = "Abc.txt";                        // File name
		File dir = new File(dirname);                      // File object for directory
		// Now check out the directory
		if (!dir.exists()){                              // If directory does not exist
		if (!dir.mkdir()){                              // create it
		System.out.println("Cannot create directory: " + dirname);
		System.exit(1);
		}
		} else if(!dir.isDirectory()) {
		System.err.println(dirname + " directory already exist");
		System.exit(1);
		}
		// Create the fileStream
		File aFile = new File(dirname, filename);         // File object for the file path
		FileOutputStream outputFile = null;                 // store the stream reference
		try {
			outputFile = new FileOutputStream(aFile, true);
			System.out.println("File stream created successfully.");
			} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			}
			// Create the file output stream channel and the buffer
			FileChannel outChannel = outputFile.getChannel();
			ByteBuffer buf = ByteBuffer.allocate(1024);
			System.out.println("New buffer: position = " + buf.position()+ "\tLimit = " + buf.limit() + "\tcapacity ="+ buf.capacity());
			// Load the data into the buffer
			for (char ch : phrase.toCharArray()) {
			buf.putChar(ch);
			}
			System.out.println("Buffer after loading: position = " + buf.position()+ "\tLimit = " + buf.limit() +"\tcapacity ="+ buf.capacity());
			buf.flip();                        // Flip the buffer ready for file write
			System.out.println("Buffer after flip: position = " + buf.position()+"\tLimit = " + buf.limit() +"\tcapacity ="+ buf.capacity());
			// Write the file
			try {
			outChannel.write(buf);              // Write the buffer to the file channel
			outputFile.close();                // Close the O/P stream & the channel
			System.out.println("Buffer contents written to file.");
			} catch (IOException e) {
			e.printStackTrace(System.err);
			}
			System.exit(0);
	}

}
