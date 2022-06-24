package com.velociter.chapter8examples;
import java.io.StreamTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Chapter 8 Example 

public class FormattedInput {
	private int readToken() {
		try {
		ttype = tokenizer.nextToken();   /* Tokenizer is object of StreamTokenizer class. ttype is a variable for storing tokens
		                                  nextToken is a predefine method used to move tokens until space is detected*/ 
		return ttype;
		} catch (IOException e) { 
		e.printStackTrace(System.err);
		System.exit(1);                // exit(1) means unsuccessful termination
		}
		return 0;
		}
	 StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));  //making the objects of predefine classes
	   private int ttype; 
       public int readInt() {
	    for (int i = 0; i < 5; i++) {
        if (readToken() == tokenizer.TT_NUMBER) {       //if the token number it will get stored in nval which is a predefine variable of streamTokenizer class
        return (int) tokenizer.nval; 
        } else {
        System.out.println("Incorrect input: " + tokenizer.sval+ " Re-enter an integer");
        continue; 
         }
         }
        System.out.println("Five failures reading an int value"+ " - program terminated");
        System.exit(1);     // exit(1) means unsuccessful termination
       return 0;
        }
			public double readDouble() throws InvalidUserInputException {
				if (readToken() != tokenizer.TT_NUMBER) {                 //conduction for checking whether the data entered is Number or not
				throw new InvalidUserInputException(" readDouble() failed."+"Input data not numeric");
				}
				return tokenizer.nval;                //storing the value in integer nval
				}
			public String readString() throws InvalidUserInputException {
				if (readToken() == tokenizer.TT_WORD || ttype == '\"'|| ttype == '\'') {  //conduction for checking whether the data entered is Word or not
				return tokenizer.sval;                  //storing the data in string sval
				} else {
				throw new InvalidUserInputException(" readString() failed. "+ "Input data is not a string");
		}				
	}
}
/*	public int readInt() throws InvalidUserInputException {
if (readToken() != tokenizer.TT_NUMBER) {  
	throw new InvalidUserInputException(" readInt() failed. "+"Input data not numeric");
	}
	if (tokenizer.nval > (double) Integer.MAX_VALUE
	|| tokenizer.nval < (double) Integer.MIN_VALUE) {
	throw new InvalidUserInputException(" readInt() failed."+ "Input outside range of type int ");
	}
	if (tokenizer.nval != (double) (int) tokenizer.nval) {
	throw new InvalidUserInputException(" readInt() failed."+ "Input not an integer");
	}
	return (int) tokenizer.nval;
	}*/