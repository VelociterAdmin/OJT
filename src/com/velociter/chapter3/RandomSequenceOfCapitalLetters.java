package com.velociter.chapter3;
/*
 * Write a program to generate a random sequence of capital letters that does not include vowels.
 */
public class RandomSequenceOfCapitalLetters {

	public static void main(String[] args) {
		for(int i=65;i<=(int)(26*Math.random()+65);i++) {
			switch((char)(i)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				continue;
			default:
				System.out.print((char)(i));
				break;
			}
		}
	}
}