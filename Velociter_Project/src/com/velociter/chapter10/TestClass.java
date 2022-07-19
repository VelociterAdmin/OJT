package com.velociter.chapter10;
// 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfWriter;
import com.velociter.chapter4.RectangularArray;
public class TestClass extends RectangularArray{
	 // These are static class members so we can reference them in all the methods in the class
	  static String phrase = "java language programe";
	  static ByteBuffer buffer = null;
	  static FileChannel wordsChannel = null;

	  static String[] words = null;         // Stores reference to array that will hold words from phrase
	  static String[] permutation = null;  
	  static int path = -1;                



	  public static void main(String args[]) {
	 
	  
	    int fromIndex = -1;
	    while(phrase.charAt(++fromIndex) == ' ');          // Skip any leading spaces
	   
	    int wordCount = 1;                                 // At least one word
	    while((fromIndex = phrase.indexOf(' ', fromIndex)) != -1) {
	      wordCount++;
	      // Skip contiguous spaces     
	      while(phrase.charAt(++fromIndex) == ' ');
	    }
	    words = new String[wordCount];                     // Array to hold the words from the phrase
	    permutation = new String[wordCount];               // Array to hold permuted words
	    
	    // Now get the words    
	    fromIndex = -1;
	    while(phrase.charAt(++fromIndex) == ' ');          // Skip any leading spaces
	    int toIndex = 0;                                   // Word end position
	    int index = 0;                                     // Free element in words array
	    while((toIndex = phrase.indexOf(' ', fromIndex)) != -1) {
	      words[index++] = phrase.substring(fromIndex,toIndex);
	      fromIndex = toIndex;
	         
	      while(phrase.charAt(++fromIndex) == ' ');  // Skip contiguous spaces
	    }
	    if(fromIndex<phrase.length())
	      words[index] = phrase.substring(fromIndex, phrase.length());

	    // Now create and write the file
	    String fileName = "permuted.txt";
	    String directoryName = "C://uploadfile";

	    // Make sure we have a directory for the file
	    File directory = new File(directoryName);
	    if(!directory.exists() || (directory.exists() && !directory.isDirectory()))
	      directory.mkdir();
	      
	    File wordsFile = new File(directory, fileName);               

	    // Create the output stream for the file
	    FileOutputStream wordsOutputStream = null;
	    try {
	      wordsOutputStream = new FileOutputStream(wordsFile);
	    } catch (FileNotFoundException e) {
	      e.printStackTrace(System.err);
	      System.exit(1);
	    }
	    wordsChannel = wordsOutputStream.getChannel();
	    buffer = ByteBuffer.allocate(2*(phrase.length()+1));  // We add one to allow for '\n' at the beginning
	    permute(0);                                           // Create and write all permutations of words array

	    try {
	      wordsOutputStream.close();
	    } catch (IOException e) {
	      e.printStackTrace(System.err);
	      System.exit(1);
	    }
	  }

	
	  private static void permute(int n) {
	    permutation[n] = ++path == 0 ? null: words[path-1];
	    if(path == words.length) 
	       write();
	    else {
	      for (int i = 0; i<words.length ; i++)
	        if(permutation[i] == null)
	           permute(i);
	    }
	      path--;
	      permutation[n] = null;

	  }

	  // Writes a permutation to the file
	  private static void write() {
	    CharBuffer charBuffer = buffer.asCharBuffer();
	    for(int i = 0 ; i< permutation.length ; i++) 
	      charBuffer.put(i==0?'\n':' ').put(permutation[i]);
	   
	    try {
	      wordsChannel.write(buffer);
	    } catch (IOException e) {
	        e.printStackTrace(System.err);
	        System.exit(1);
	    } 
	    buffer.clear();
	  }
	}

