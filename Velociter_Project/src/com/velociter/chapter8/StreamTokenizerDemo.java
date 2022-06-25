package com.velociter.chapter8;
import java.io.BufferedReader;        
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.io.StringReader;


public class StreamTokenizerDemo {

public static void main(String[] args)throws IOException {
 System.out.println("Enter values by Keyboard:");	//Enter the value	
StreamTokenizer StreamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	
	while(StreamTokenizer.nextToken()!=StreamTokenizer.TT_EOF) {//used while loop for 
			if(StreamTokenizer.ttype==StreamTokenizer.TT_WORD) {
				System.out.println(StreamTokenizer.sval+",");
			}
			else if(StreamTokenizer.ttype==StreamTokenizer.TT_NUMBER){
				System.out.println(StreamTokenizer.nval);
			}
	
		}
	}
}
	

