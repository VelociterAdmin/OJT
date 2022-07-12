package com.velociter.chapter10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePDF {

	public CreatePDF(String filename) {
		filename = filename;
	}

	public static void main(String args[]) throws IOException {
		/*
		 * String dirname="F:\\File Accessing"; String filename=
		 * "D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter4\\RectangularArray.java";
		 * File afile = new File(filename);
		 */

//created PDF document instance   
		Document doc = new Document();
		try {
//generate a PDF at the specified location  
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("F:\\File Accessing\\New.pdf"));
			System.out.println("PDF created.");
			doc.open();
			CreatePDF pdf = new CreatePDF("D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter4\\RectangularArray.java");
			doc.add(new Paragraph("Hello world"));
			doc.close();
			writer.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
