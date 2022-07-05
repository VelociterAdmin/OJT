package com.velociter.chapter10example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
//Example of chapter 10
// Writing inside the file
public class WritingInFile {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("H:\\sub.txt");       //creating object of FileWriter
		BufferedWriter buf=new BufferedWriter(file);        // creating object BufferedWriter object
		buf.write("danish qureshi 4");
		buf.close();
 }
}
