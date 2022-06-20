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
}