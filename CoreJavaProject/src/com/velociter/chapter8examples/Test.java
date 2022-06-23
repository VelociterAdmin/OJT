package com.velociter.chapter8examples;
import java.io.*;
import java.util.*;
public class Test { 
	public static void main(String[] args) throws IOException {
		int count = 0;
		for(int ch = 'a' ; ch<= 'z' ; ch++) {
		System.out.printf("  %1$4c%1$4x", ch);
		if(++count%6 == 0) {
		System.out.printf("\n");
		}
		}
		
	}
	/*	Test t=new Test();
		t.readToken();
		t.readInt();
	}
	    private int readToken() {
		try {
		ttype = tokenizer.nextToken();   // Tokenizer is object of StreamTokenizer class. ttype is a variable for storing tokens
		                                 // nextToken is a predefine method used to move tokens until space is detected
		return ttype;
		} catch (IOException e) { 
		e.printStackTrace(System.err);
		System.exit(1);                // exit(1) means unsuccessful termination
		}
		return 0;
		}
	    StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))); 
		 private int ttype;
		 public int readInt() {
	     for (int i = 0; i < 5; i++) {
	     if (readToken() == tokenizer.TT_NUMBER) {       //if the token number it will get stored in nval which is a predefine variable of streamTokenizer class
		 return (int) tokenizer.nval; 
		  }
	     else {
		  System.out.println("Incorrect input: " + tokenizer.sval+ " Re-enter an integer");
		  continue; 
		   }
		  }
		  System.out.println("Five failures reading an int value"+ " - program terminated");
		  System.exit(1);     // exit(1) means unsuccessful termination
		  return 0;
 
}*/
}
