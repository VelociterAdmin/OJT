package com.velociter.chapter10;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;
import java.io.BufferedReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.velociter.chapter4.RectangularArray;

public class GeneratePdfFile{
	
   public static void main(String[] args) throws IOException {
	 FileReader file = new FileReader("D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter4\\RectangularArray.java");
	 BufferedReader buf=new BufferedReader(file);
	 String str;
	 while((str=buf.readLine())!=null){
		 System.out.println(str);
	 }
	 buf.close();
	
   }  
   Document doc = new Document();
   PdfWriter writer=PdfWriter.getInstance(doc,new FileOutputStream("F:\\File Accessing\\new.pdf"));
   System.out.println(" pdf is create");
}
