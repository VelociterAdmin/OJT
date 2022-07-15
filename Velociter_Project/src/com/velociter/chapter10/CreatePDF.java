package com.velociter.chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.velociter.chapter4.*;
public class CreatePDF extends RectangularArray {


	public static void main(String args[]) {

	
//created PDF document instance   
		Document doc = new Document();
		try {
//generate a PDF at the specified location  
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("F:\\File Accessing\\New.pdf"));
			System.out.println("PDF created.");
			doc.open();
			Font font=FontFactory.getFont(FontFactory.COURIER,20,BaseColor.BLUE);
			doc.add(new Paragraph("Hello World..."));
			doc.close();
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
