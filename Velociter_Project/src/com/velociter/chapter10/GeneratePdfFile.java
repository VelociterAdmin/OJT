package com.velociter.chapter10;


import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.velociter.chapter4.RectangularArray;

public class GeneratePdfFile extends RectangularArray {
 
	public static void main(String[] args) {
		
	/*	  FileReader file = new FileReader("D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter4\\RectangularArray.java");
		  BufferedReader buf=new BufferedReader(file);
		  String str;
		  while((str=buf.readLine())!=null){ 
			  System.out.println(str); 
			  }
		  buf.close();
		  }
	
}*/
		try {

			// Creating file output stream
			PrintStream fileOut = new PrintStream("F:\\File Accessing\\NewFile2.txt");

			System.out.println("Data is printed :");

			// Redirecting standard console output to a file.
			System.setOut(fileOut);

			// Get input using Scanner from Console
			Scanner scanner = new Scanner(System.in);
            
			// Read string line.
		
			RectangularArray arrayobj=new RectangularArray();
			arrayobj.array();
			String inputLine = scanner.nextLine();
			System.out.println(inputLine);

			// Get next user input line text.
			inputLine = scanner.nextLine();

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	}		
	

