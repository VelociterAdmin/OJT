package com.velociter.chapter3;

public class MultiplicationArray {
/*
 * Write a program to create a rectangular array containing a multiplication table from 1 * 1 up to
 * 12 * 12. Output the table as 13 columns with the numeric values right-aligned in columns. (The
 * first line of output will be the column headings, the first column with no heading, then the
 * numbers 1 to 12 for the remaining columns. The first item in each of the succeeding lines is the
 * row heading, which ranges from 1 to 12.)
 */
	public static void main(String[] args) {
		int[][] twoDArray = new int[10][12];
//twoDArray[][] = {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20},{21,22,23,24,25,26,27,28,29,30}};
		for(int i=0; i<twoDArray.length; i++) {
			for(int j=0; j < twoDArray[i].length; j++) {
				twoDArray[i][j] = (i*j)+1;
			}
		}
		for(int i=0; i<twoDArray.length; i++) {
			for(int j=0; j<twoDArray[i].length;j++) {
				System.out.print(twoDArray[i][j]+"\t");
			}
//			System.out.print("\");
			System.out.println();
		}
	}

}
