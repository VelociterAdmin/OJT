package com.velociter.chapter8examples;
import java.io.StreamTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class FormattedInput {
	private int readToken() {
		try {
		ttype = tokenizer.nextToken();
		return ttype;
		} catch (IOException e) { 
		e.printStackTrace(System.err);
		System.exit(1); 
		}
		return 0;
		}
	private StreamTokenizer tokenizer = new StreamTokenizer(
			new BufferedReader(
			new InputStreamReader(System.in)));
			private int ttype; 

public int readInt() {
	for (int i = 0; i < 5; i++) {
if (readToken() == tokenizer.TT_NUMBER) {
return (int) tokenizer.nval; 
} else {
System.out.println("Incorrect input: " + tokenizer.sval+ " Re-enter an integer");
continue; 
}
}
System.out.println("Five failures reading an int value"+ " - program terminated");
System.exit(1);
return 0;
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
			public double readDouble() throws InvalidUserInputException {
				if (readToken() != tokenizer.TT_NUMBER) {
				throw new InvalidUserInputException(" readDouble() failed."+"Input data not numeric");
				}
				return tokenizer.nval;
				}
			public String readString() throws InvalidUserInputException {
				if (readToken() == tokenizer.TT_WORD || ttype == '\"'|| ttype == '\'') {
				return tokenizer.sval;
				} else {
				throw new InvalidUserInputException(" readString() failed. "+ "Input data is not a string");
		}				
	}
}