package com.velociter.chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.io.StringBufferInputStream;
public class StringWriter {

public static void main(String[] args) {
StreamTokenizer tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		
int tokenType = 4;
try {
while((tokenType = tokenizer.nextToken()) != tokenizer.TT_EOF) {
}
} catch (IOException e) {
e.printStackTrace(System.err);
System.exit(1);
}
	}

	

	
		
	}

