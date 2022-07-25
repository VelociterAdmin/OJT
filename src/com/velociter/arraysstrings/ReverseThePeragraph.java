package com.velociter.arraysstrings;
/*
 * Write a program that will reverse the sequence of letters in each word of your chosen paragraph
 * from Exercise 3. For instance, “To be or not to be.” would become “oT eb ro ton ot eb.”
 */
public class ReverseThePeragraph {

	public static void main(String[] args) {
		//String Variable to store peragraph
		String text = 
"You can extract a character from a String object by using the charAt() method. This accepts an integer argument that is the offset of the character position from the beginning of the string — in other words";
		String[] words = text.split(" ");					//String[] to split text into word.
		String[] reverseWords = new String[words.length];	//String[] to store reversed words
		StringBuffer sBuffer = new StringBuffer();			//StringBuffer Object
 
		for(int i=0; i<words.length; i++) {					//for loop
			sBuffer.append(words[i]);						//appending word veriable to Sbuffer
			sBuffer.reverse();								//reversing Sbuffer words
			reverseWords[i] =sBuffer.toString()+" ";		//storing reverse words in reverseWords[]
			sBuffer.setLength(0);							//clearing Sbuffer
			}
		System.out.println("The peragraph:");
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");					//Printing actual peragraph
		}
		System.out.println("\n\nReversed peragraph:");
		for(int i=0; i<reverseWords.length; i++) {
			System.out.print(reverseWords[i]);				//Printing reversed peragraph
		}

		
	}

}
