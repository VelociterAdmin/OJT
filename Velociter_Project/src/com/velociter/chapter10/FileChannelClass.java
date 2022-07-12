package com.velociter.chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.*;
 // 2 example of chapter 10;

public class FileChannelClass {
	public static void main(String[] args) {
		ByteBuffer buf= ByteBuffer.allocate(240);
		File aFile = new File("F:\\new");
		FileOutputStream outputFile = null; // Place to store an output stream reference
		try {
		// Create the stream opened to write
		outputFile = new FileOutputStream(aFile);
		} catch (FileNotFoundException e) {
		e.printStackTrace(System.err);
		}
		// Get the channel for the file
		FileChannel outputChannel = outputFile.getChannel();
		try {
			outputChannel.write(buf); // Write the buffer contents to the file
			} catch (IOException e) {
			e.printStackTrace(System.err);
			}
		try {
			outputChannel.force(false); // Force data transfer to the file
			} catch (IOException e) {
			e.printStackTrace(System.err);
			}
		
	}
	
}
