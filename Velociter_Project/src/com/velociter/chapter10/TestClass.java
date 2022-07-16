package com.velociter.chapter10;
// 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfWriter;
import com.velociter.chapter4.RectangularArray;
public class TestClass extends RectangularArray{
	
	public static void main(String[] args)  {
		
		 /* Document doc = new Document();
		  PdfWriter writer = PdfWriter.getInstance(doc,new FileOutputStream("F:\\File Accessing\\NewPdf2.pdf"));
		  System.out.println("PDF created.");
		 */

		try {

			// Creating file output stream
			PrintStream fileOut = new PrintStream("F:\\File Accessing\\NewFile.txt");

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
