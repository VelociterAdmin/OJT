package com.velociter.chapter10;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class PrintDatesInAString {

		public static void main(String args[]) {
			String fileName = "dates.txt";
			String dirName = "F:\\DateDir";
			
		    String[] months = { "January ", "February ", "March ", "April ", "May ", "June ", "July ", "August ",
					"September ", "October ", "November ", "December ", };
			
			int[][] dates = {{2,11,2022},{3,5,2021},{5,10,1990},{12,10,2015},{29,11,1998},
					         {25,05,1999},{9,8,2000},{30,8,2002},{25,07,1990},{2,10,1996}};
			
			File dir=new File(dirName);
			if(!dir.exists()) {
				if(!dir.mkdir());
				System.out.println("cannot create directory"+dirName);
			}
			else if(!dir.isDirectory()) {
				System.err.println("is not a directory"+dirName);
				
			}
			File afile = new File(dirName,fileName);
			
			FileOutputStream outputStream=null;
			try {
				outputStream=new FileOutputStream(afile,false);
			    System.out.println("File is created");
			}catch(FileNotFoundException ex) {
				ex.printStackTrace();
			}
			FileChannel channel = outputStream.getChannel();
			
		}
}
		 
			
			
			

	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		