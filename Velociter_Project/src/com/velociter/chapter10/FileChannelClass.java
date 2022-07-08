package com.velociter.chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.*;
 // 2 example of chapter 10;

public class FileChannelClass {
	public static void main(String[] args) {
		File file = new File("F:\\FileChannel");
		FileOutputStream outputfile= null;
		try {
			outputfile=new FileOutputStream(file);
		}
		catch(FileNotFoundException e) {
			System.out.println(System.err);
			
		}
		FileChannel outputchannel = outputfile.getChannel();
		
		
	}
	
}
