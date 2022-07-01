package com.velociter.chapter9;
//4 Example of Chapter 9
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTempFile {
	public static void main(String[]args) throws IOException {
		File tempFile = File.createTempFile("TKg","java");
		// deletes file when the virtual machine terminate
		tempFile.deleteOnExit();
		FileOutputStream outputFile = null; //  store the stream reference
		try {
		outputFile = new FileOutputStream("ReverseTheSequenceOfLetter.java");
		} catch(FileNotFoundException e) {
		e.printStackTrace(System.err);
		}
		
	}
}
