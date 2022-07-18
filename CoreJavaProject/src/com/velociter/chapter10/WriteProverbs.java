package com.velociter.chapter10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.StringTokenizer;

//10th chapter 
//code writes  proverbs in a text file 
public class WriteProverbs {
	public static void main(String[] args) {
		String dirName = "H:\\Expirement";                        // Directory for the output file
		String fileName = "Proverbs2.txt";                            // Name of the output file
		String[] sayings = { "  Indecision maximizes flexibility.", "  Only the mediocre are always at their best.",
				"  A little knowledge is a dangerous thing.", "  Many a mickle makes a muckle.",
				"  Who begins too much achieves little.", "  Who knows most says least.",
				"  A wise man sits on the hole in his carpet." };
		File aFile = new File(dirName, fileName);
		FileOutputStream outputFile = null;
		try {
			outputFile = new FileOutputStream(aFile, true);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		FileChannel outChannel = outputFile.getChannel();
		                                                    // Create a buffer to accommodate the longest string + its length value
		  
		ByteBuffer buf = ByteBuffer.allocate(1024);
		CharBuffer charB= buf.asCharBuffer();
		char seprator='*';
		try {
			for(int i=0;i<sayings.length;i++) {
				if(i>=0) 
					charB.put(seprator);
					charB.put(sayings[i]);
					buf.position(2*charB.position()).flip();
					outChannel.write(buf);
					charB.clear();
					buf.clear();
				}
				outputFile.close();


			System.out.println("Proverbs written to file.");
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		System.exit(0);
  }

}
