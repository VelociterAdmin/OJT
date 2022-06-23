package com.velociter.chapter4;

public class MultiplicationArray {
/*
 * Write a program to create a rectangular array containing a multiplication table from 1 * 1 up to
 * 12 * 12. Output the table as 13 columns with the numeric values right-aligned in columns. (The
 * first line of output will be the column headings, the first column with no heading, then the
 * numbers 1 to 12 for the remaining columns. The first item in each of the succeeding lines is the
 * row heading, which ranges from 1 to 12.)
 */
	public static void main(String[] args) {
		int size=32;
		size++;
		int[][] twoDArray = new int[size][size];										//Array to store numbers
		for(int i=0; i<twoDArray.length; i++) {											//Storing numbers in twoDArray
			for(int j=0; j < twoDArray[i].length; j++) {
				twoDArray[i][j] = (i*j);
			}
		}
		System.out.print("\t");															//Heading rows 1 2 3 4 5 6.....
		for(int i=1; i<2; i++) {
			for(int j=1; j<twoDArray[i].length; j++) {
				System.out.print("\t"+j);
			}
			
			
		}
		System.out.println();
		System.out.print("\t");
		for(int i=1; i<2; i++) {														//For Underline
			for(int j=1; j<twoDArray[i].length; j++) {
				System.out.print("\t_");
			}
			System.out.println();
			
		}
		for(int i=1; i<twoDArray.length; i++) {										//Printing twoDArray
			System.out.print(i+"\t|\t");
			for(int j=1; j<twoDArray[i].length;j++) {
//				System.out.print((i)+" * "+(j)+" = "+(twoDArray[i][j])+"\t\t");		//to print 1*1 upto 12*12
				
				System.out.print((twoDArray[j][i])+"\t");
			
			}

			System.out.println("");
		}
	}

}
