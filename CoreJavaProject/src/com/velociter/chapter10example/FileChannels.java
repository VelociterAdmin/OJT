package com.velociter.chapter10example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
//Example of chapter 10
//
public class FileChannels {

	public static void main(String[] args) throws IOException {
		File aFile = new File("");
		FileOutputStream outputFile = null;                               // Place to store an output stream reference
		try {
		
		outputFile = new FileOutputStream(aFile);                        // Create the stream opened to write
		} catch (FileNotFoundException e) {
		e.printStackTrace(System.err);
		System.exit(1);
		}
		
		FileChannel outputChannel = outputFile.getChannel();             // Get the channel for the file
	}
	
}
