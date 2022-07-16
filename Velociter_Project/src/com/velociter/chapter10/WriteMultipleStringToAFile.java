package com.velociter.chapter10;

// 10 Example of chapter 10;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

// Writing Multiple Strings to a File
public class WriteMultipleStringToAFile {

	public static void main(String[] args) {
		String dirName = "F:\\new";           // Directory for the output file
		String fileName = "Proverbs.txt";         // Name of the output file
		String[] sayings = { " Indecision maximizes flexibility.", " Only the mediocre are always at their best.",
				" A little knowledge is a dangerous thing.", " Many a mickle makes a muckle.",
				" Who begins too much achieves little.", " Who knows most says least.",
				" A wise man sits on the hole in his carpet." };
		File aFile = new File(dirName, fileName);
		FileOutputStream outputFile = null;
		try {
			outputFile = new FileOutputStream(aFile, false);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		FileChannel outChannel = outputFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(1024);
		CharBuffer charBuf = buf.asCharBuffer();

		char separator = '*';

		/*
		 * Write the file try { for (String saying : sayings) {
		 * buf.putInt(saying.length()).asCharBuffer().put(saying);
		 * buf.position(buf.position() + 2*saying.length()).flip();
		 * outChannel.write(buf); // Write the buffer to the file channel buf.clear(); }
		 */

		// Write the file
		try {
			for (int i = 0; i < sayings.length; i++) {
				if (i > 0) {
					charBuf.put(separator);

				charBuf.put(sayings[i]);
				buf.position(2 * charBuf.position()).flip();
				outChannel.write(buf); // Write the buffer to the file channel
				charBuf.clear();
				buf.clear();
			}}
			outputFile.close(); // Close the output stream & the channel
			System.out.println("Proverbs written to file.");
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		System.exit(0);
	}

}
