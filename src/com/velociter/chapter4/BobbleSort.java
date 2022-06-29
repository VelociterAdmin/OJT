package com.velociter.chapter4;

import java.util.Scanner;

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
public class BobbleSort {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args){
		//Scanner to scan the order:
		Scanner scan = new Scanner(System.in);
		//String veriable to store peragraph
		String text = "Write a program that sets up a String variable containing a paragraph of text of your choice.\r\n"
				+ "Extract the words from the text and sort them into alphabetical order. Display the sorted list of\r\n"
				+ "words. You could use a simple sorting method called the bubble sort.";
		//String[] to split peragraph
		String[] words = text.split(" ");
		//temperary veriable
		String temp ="";
		//variable to control order
		int order;
		//Scanning order
		System.out.println("1: Ascending order\n2: Descending order");
		order = scan.nextInt();
		
		for(int i=0; i<words.length; i++) {
			for(int j=i+1; j<words.length; j++) {
				if(order == 1) {								//for Ascending order
					
				
					if(words[i].compareTo(words[j])>0) {			//words[i] 
						temp = words[i];							// temp		= words[1]  
						words[i]=words[j];							// words[1]	= words[2]
						words[j]=temp;								// words[2]	= temp
						}
					}
				
				else if(order == 2) {							//for Descending order
					
					if(words[j].compareTo(words[i])>0) {
						temp = words[i];							// temp 	= words[1]
						words[i] = words[j];						// words[1]	= words[2]
						words[j]=temp;								// words[2] = temp
					}
				}
			}
		}
		if(order == 1) {
			for(String str : words)
				System.out.println(str);	
		}
		else if(order ==2) {
			for(String str : words)
				System.out.println(str);
		}
		else {
			System.out.println("Re Run the program:");
		}
//		int a = words[0].compareTo(words[1]);
//		System.err.println(a);
	}


}
