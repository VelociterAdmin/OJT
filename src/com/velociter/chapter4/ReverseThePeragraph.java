package com.velociter.chapter4;
/*
Write a program that will reverse the sequence of letters in each word of your chosen paragraph
from Exercise 3. For instance, “To be or not to be.” would become “oT eb ro ton ot eb.”
*/
public class ReverseThePeragraph {

	public static void main(String[] args) {
		String text = "Java is programming";
		String[] words = text.split(" ");
		String[] revWords = new String[words.length];
		StringBuffer sBuffer = new StringBuffer();
 
		for(int i=0; i<words.length; i++) {
			sBuffer.append(words[i]);
			sBuffer.reverse();
			revWords[i] = " "+sBuffer.toString()+" ";
		}
		for(int i=0; i<revWords.length; i++) {
			System.out.print(revWords[i]);
		}
	}

}
