package com.velociter.chapter4;
/*
Write a program that sets up a String variable containing a paragraph of text of your choice.
Extract the words from the text and sort them into alphabetical order. Display the sorted list of
words. You could use a simple sorting method called the bubble sort. To sort an array into
ascending order the process is as follows:
a. Starting with the first element in the array, compare successive elements (0 and 1, 1 and
2, 2 and 3, and so on).
b. If the first element of any pair is greater than the second, interchange the two elements.
c. Repeat the process for the whole array until no interchanges are necessary. The array
elements will now be in ascending order.
*/
public class StringSort {

	public static void main(String[] args) {
		String text = "You will need to use character strings in most of your programs\n"
				+ "headings, names, addresses, product descriptions, messages.";
		System.out.print(text+"\n\n");		
		String[] stringArray = text.split(" ");
		for(int i=0; i<stringArray.length; i++) {
//			if((stringArray[i-1])<(stringArray[i]))
				System.out.println(stringArray[i]);
		}
	}

}
