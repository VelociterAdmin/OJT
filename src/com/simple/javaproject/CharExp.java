package com.simple.javaproject;

public class CharExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter1 = 'A';
		char letter2 = (char) (letter1+1);
		char letter3 = letter2;
		char letter4 = ++letter3;
		System.out.println("The letters are:\t" +letter1 + letter2 + ++letter3);
		System.out.println(letter1 +" : "+ (int)letter1 +"\t"+ letter2+" : " +(int)letter2 + "\t "+ letter3 +":" + (int) letter3);
		System.out.println("Hexadecimal values:\n"+ letter1 +" : "+ Integer.toHexString(letter1) +"\t"+ letter2+" : " +Integer.toHexString
				(letter2)+ "\t "+ letter3 +":" + Integer.toHexString(letter3) +"\t"+ letter4 + " : "+ Integer.toHexString(letter4));
	}

}
