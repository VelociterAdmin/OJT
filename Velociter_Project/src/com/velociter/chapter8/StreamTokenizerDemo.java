package com.velociter.chapter8;

import java.io.IOException;
import java.io.InputStream;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.Reader;

public class StreamTokenizerDemo {

public static void main(String[] args)throws IOException {
		
	StringReader stringReader=new StringReader("There is 1 StreamTokenizer class and 2 StringReader class :");
		
	StreamTokenizer StreamTokenizer = new StreamTokenizer(stringReader);

	while(StreamTokenizer.nextToken()!=StreamTokenizer.TT_EOF) {
			if(StreamTokenizer.ttype==StreamTokenizer.TT_WORD) {
				System.out.println("Inside TT_Word:"+StreamTokenizer.sval);
			}
			else if(StreamTokenizer.ttype==StreamTokenizer.TT_NUMBER){
				System.out.println("Inside TT_Number:"+StreamTokenizer.nval);
			}
		
		}
	}
}
	

