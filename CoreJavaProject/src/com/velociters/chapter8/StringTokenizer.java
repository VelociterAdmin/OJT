package com.velociters.chapter8;
import java.io.*;               //imported java.io package
public class StringTokenizer { 
	public static void main(String[] args) throws IOException {
		System.out.println("Please give the input from keybord");
	StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));       //made object of StreamTokenizer 
	                                                                                                  //And took input by System.in
	while(streamTokenizer.nextToken()!=streamTokenizer.TT_EOF){
		if(streamTokenizer.ttype==streamTokenizer.TT_WORD) {
			System.out.println(streamTokenizer.sval+",");
		}
		else if(streamTokenizer.ttype==streamTokenizer.TT_NUMBER) {
			System.out.println(streamTokenizer.nval);
		}
	}
 }	
}
	