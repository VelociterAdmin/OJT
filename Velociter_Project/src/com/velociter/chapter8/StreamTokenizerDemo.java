package com.velociter.chapter8;

import java.io.IOException;
import java.io.InputStream;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.Reader;

public class StreamTokenizerDemo {


	private static final InputStream StringReader =null;

	public static void main(String[] args)throws IOException {
		StreamTokenizer StreamTokenizer=null;
		StringReader sr=new StringReader("this is tokenizer:");
		 StreamTokenizer = new StreamTokenizer(StringReader);
		}
}
	while(StreamTokenizer.nextToken()!=StreamTokenizer.TT_EOF) {
			if(StreamTokenizer.ttype==StreamTokenizer.TT_WORD) {
				System.out.println("Inside TT_Word:"+StreamTokenizer.sval);
			}
			else if(StreamTokenizer.ttype==java.io.StreamTokenizer.TT_NUMBER){
				System.out.println("Inside TT_Number:"+StreamTokenizer.nval);
			}
		
		}
	}
}
	

