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

public class GeneratePdfFile {
 
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
	
		//created PDF document instance   
				Document doc = new Document();
				try {
		//generate a PDF at the specified location  
					PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("F:\\File Accessing\\New.pdf"));
					System.out.println("PDF created.");
					doc.open();
					Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
				doc.add(new Paragraph("Hello world...."));
				doc.close();
					//writer.close();
				} catch (DocumentException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	}
}
				
	

