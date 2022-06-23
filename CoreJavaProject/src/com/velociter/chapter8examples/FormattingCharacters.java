package com.velociter.chapter8examples;

import java.io.IOException;
// Chapter 8 Exapmle
public class FormattingCharacters {

	public static void main(String[] args) throws IOException {
		int count = 0;                              //declaring integer count
		for(int ch = 'a' ; ch<= 'z' ; ch++) {       //using for loop to print data multiple times
		System.out.printf("  %1$4c%1$4x", ch);
		if(++count%6 == 0) {                        //if incremented count is divided by 6 and gives reminder 0   
		System.out.printf("\n");
		}
     }
   }
}