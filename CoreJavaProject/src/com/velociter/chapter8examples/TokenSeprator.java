package com.velociter.chapter8examples;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
public class TokenSeprator {

	public static void main(String[] args) throws IOException {
		StringReader stringReader= new StringReader("1 my name is danish");
		StreamTokenizer streamTokenizer =new StreamTokenizer(stringReader);
		while(streamTokenizer.nextToken()!=streamTokenizer.TT_EOF){
			if(streamTokenizer.ttype==streamTokenizer.TT_WORD) {
				System.out.println("TT_Word:"+streamTokenizer.sval);
			}
			else if(streamTokenizer.ttype==streamTokenizer.TT_NUMBER) {
				System.out.println("TT_Number:"+streamTokenizer.nval);
			}
		}
	}

}
