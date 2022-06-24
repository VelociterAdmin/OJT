package com.velociter.chapter8;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.BufferedReader;
// 1st Example of chapter 8.

public class FormattedInputExample {
 private int ttype;             // Stores the token type code
	private int readToken() {  //declare a readToken method
	
	try {
		ttype=tokenizer.nextToken();  //initialize ttype by using object of StreamTokenizer class.
		return ttype;
	}catch(IOException e) {      //caught the exception
		e.printStackTrace(System.err);
		System.exit(1);
	}
	return 0;
}
StreamTokenizer tokenizer=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
   
public int readInt() {    // Method to read an int value
	for(int i=0;i<5;i++) {
		if(readToken()== tokenizer.TT_NUMBER) {
		  return (int)tokenizer.nval;    //  return integer value
		  } else {
			System.out.println("Incorrect input:" + tokenizer.sval +  "Re-enter an integer");
			continue; 
		}
			}
			System.out.println("Five failures reading an int value"+ "- program terminated");
			System.exit(1);   // termination unsuccessful due to some error
			return 0;
		}
public double readDouble() throws InvalidUserInputException {
	   if (readToken() != tokenizer.TT_NUMBER) {
	    throw new InvalidUserInputException(" ReadString() failed. "+ "Input data is not numeric");
	}
	return tokenizer.nval;       //return double value
	}
	 public String readString() throws InvalidUserInputException{
		 if (readToken() == tokenizer.TT_WORD || ttype == '\"' || ttype == '\'') {
		 return tokenizer.sval;       //return string value
		 } else {
		 throw new InvalidUserInputException("readString() failed. "+ "Input data is not a string");
		 }
		 }
}


