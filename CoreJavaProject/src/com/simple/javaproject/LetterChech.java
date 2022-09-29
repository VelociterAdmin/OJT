package com.simple.javaproject;

public class LetterChech {

	public static void main(String[] args) {
		char symbol = 'A';
		int i=0;
		while(i<25) {
			symbol  = (char) (128.0*Math.random());
			if(symbol>='A') {
				if(symbol <= 'Z') {
					System.out.println("The letter is Capital "+symbol + " ASCII "+ (int) (symbol));
				}
				else {
					if(symbol >= 'a') {
						if(symbol<='z'){
							System.out.println("The letter is Small "+symbol);
						}
						else {
							System.out.println("The code is greater then a but not a letter");
						}
					}
					else {
						System.out.println("The code is less then a but not a letter");
					}
				}
			}
			else {
				System.out.println("The code is greater then A so it is not a letter");
			}
			i++;
		}
	}

}
