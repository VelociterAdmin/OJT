package com.velociter.chapter10;
// 6 Example of Chapter 10;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WritingAStringAsByte {

	public static void main(String[] args) {
		String phrase = new String("Garbage in, garbage out \n");
		String dirname = "F:\\File Accessing\\WriteString";   // Directory name
		String filename = "New.txt";             //filename
		File aFile = new File(dirname, filename); // Create a file object
		// Create the file output stream
		FileOutputStream file = null;
		try {
		//FileOutputStream in append by passing the second argument as true 
		file = new FileOutputStream(aFile, true); 
		} catch (FileNotFoundException e) {         //Caught exception
		e.printStackTrace(System.err);
		}
		FileChannel outChannel = file.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(phrase.length()); //create object of ByteBuffer
		byte[] bytes = phrase.getBytes();
		buf.put(bytes);
		buf.flip();
		try {
		outChannel.write(buf);
		file.close();                  // Close the output stream & the channel
		} catch (IOException e) {
		e.printStackTrace(System.err);
		}
		}
		}
		

