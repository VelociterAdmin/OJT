package com.velociter.chapter10example;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
//example of chapter 10
//write a string as bytes into a file
public class WriteAStringAsBytes {
	public static void main(String[] args) {
		String phrase = new String("hi\n");
		String dirname = "H:\\directories"; // Directory name
		String filename = "byteData.txt";
		File aFile = new File(dirname, filename);
		// Create the file output stream
		FileOutputStream file = null;
		try {
			file = new FileOutputStream(aFile, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
		}
		FileChannel outChannel = file.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(phrase.length());
		byte[] bytes = phrase.getBytes();
		buf.put(bytes);
		buf.flip();
		try {
			outChannel.write(buf);
			file.close(); // Close the output stream & the channel
		} catch (IOException e) {
			e.printStackTrace(System.err);
		}
	}
}
