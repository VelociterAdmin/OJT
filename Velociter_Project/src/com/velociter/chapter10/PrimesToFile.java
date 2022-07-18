package com.velociter.chapter10;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class PrimesToFile {

	static String[] months = { "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
			"September ", "October ", "November ", "December ", };

	public static void main(String args[]) {
		int[][] dates = { { 12, 11, 1932 }, { 2, 29, 1944 }, { 3, 9, 1944 }, { 4, 1, 1999 },{ 12, 5, 1939 }, 
					      { 3, 8, 1968 }, { 1, 1, 2000 }, { 2, 2, 2002 }, { 10, 23, 1946 }, { 8, 3, 1986 } };

		String[] dateStrings = new String[dates.length];  // Stores date strings

// Convert dates to string representations
		for (int count = 0; count < dates.length; count++)
			dateStrings[count] = dateToString(dates[count]);

// Write the date strings to a file
		String fileName = "dates.txt";
		String dirName = "F://DateDir";

		File dir = new File(dirName);
		if(!dir.exists()) {
			if(!dir.mkdir());
			System.out.println("cannot create directory"+dirName);
		}
		else if(!dir.isDirectory()) {
			System.err.println("is not a directory"+dirName);
			
		}
		
      File afile = new File(dirName,fileName);
// Create the output stream for the file
		FileOutputStream OutputStream = null;
		try {
			OutputStream = new FileOutputStream(afile,true);
		} catch (FileNotFoundException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		FileChannel textChannel = OutputStream.getChannel();

		ByteBuffer[] buffers = { ByteBuffer.allocate(256),null};

		try {
			for (int i = 0; i < dateStrings.length; i++) {
				buffers[0].putInt(dateStrings[i].length()).flip();
				buffers[1] = ByteBuffer.allocate(2 * dateStrings[i].length());
				buffers[1].asCharBuffer().put(dateStrings[i]);
				textChannel.write(buffers);
				buffers[0].clear();
			}
			OutputStream.close();
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
		System.out.println("File write successfully.");
	}

	private static String dateToString(int[] date) {
		assert date.length == 3; // Array must have three elements
		StringBuffer dateString = new StringBuffer(String.valueOf(date[1]));

		String ending = null; // Day ending, st, nd, or th
		if (date[1] == 1 || date[1] == 21 || date[1] == 31)
			ending = "st ";
		else if (date[1] == 2 || date[1] == 22)
			ending = "nd ";
		else if (date[1] == 3 || date[1] == 23)
			ending = "rd ";
		else
			ending = "th ";
		return dateString.append(ending).append(months[date[0] - 1]).append(String.valueOf(date[2])).toString();
	}
}
