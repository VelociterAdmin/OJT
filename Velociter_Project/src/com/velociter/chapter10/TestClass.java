package com.velociter.chapter10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
	public static void main(String[] args) {

		try {
			// create an print writer for writing to a file
			PrintWriter out = new PrintWriter(new FileWriter("D:\\Training\\OJT\\Velociter_Project\\src\\com\\velociter\\chapter4\\RectangularArray.java"));
			// create a buffered reader that connects to the console, we use it so we can
			// read lines
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			// read a line from the console
			String lineFromInput = in.readLine();

		/*	int n = 99;
			int m = 99;

			int[][] table = new int[n][m];

			for (int i = 0; i < table.length; ++i) {
				for (int j = 0; j < table[i].length; ++j) {
					table[i][j] = (i + 1) * (j + 1);
				}
			}

			System.out.print("       ");
			for (int j = 1; j <= table[0].length; ++j) {
				System.out.print((j < 10 ? "    " : "   ") + j);
			}
			System.out.println(" \n ");

			for (int i = 0; i < table.length; ++i) {
				System.out.print("Row" + (i < 9 ? "  " : " ") + (i + 1) + ":");

				for (int j = 0; j < table[i].length; ++j) {
					System.out.print((table[i][j] < 10 ? "   " : table[i][j] < 100 ? "  " : " ")
							+ (table[i][j] < 1000 ? " " : "") + table[i][j]);
				}
				System.out.println();
			}*/

			// output to the file a line
			out.println(lineFromInput);

			// close the file (VERY IMPORTANT!)
			out.close();
		} catch (IOException e1) {
			System.out.println("Error during reading/writing");
		}

	}

}
