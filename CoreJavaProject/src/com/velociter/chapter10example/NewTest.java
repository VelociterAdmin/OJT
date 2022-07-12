package com.velociter.chapter10example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class NewTest {

	public static void main(String[] args) throws FileNotFoundException {
		String filename = "C://Beg Java Stuff//trueFalse.txt";
		boolean b ;
		File file = new File(filename);
		System.out.println(file.length());
		if (file.length() == 0)
		{	
         System.out.println("file is empty");
		//System.out.print(b = true);
		}
		
		else
		{
			System.out.println("there is content inside the file");
		//System.out.println(b=false);
		}
		//outputFile = new FileOutputStream(aFile, b);

	}

}
