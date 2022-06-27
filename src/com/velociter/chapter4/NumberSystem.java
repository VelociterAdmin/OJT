package com.velociter.chapter4;

import java.util.Scanner;


//Number System Decimal to Binary,Octal & HexaDecimal;


public class NumberSystem {

	static void toBinary(int decimal) {
		int rem=0;												//Reminder to store
		String toBinari = "";									//String to store BinaryNumber
		System.out.print("Decimal "+ decimal+" to Binary : ");
		if(decimal==0)
			toBinari = "0";
		while(decimal>0) {
			rem = decimal%2;									//dividing number by 2 and storing reminder
			decimal = decimal/2;								//dividing number by 2
			toBinari = rem+toBinari;							//storing Binary value
		}
//		toBinari = rem+toBinari;
		System.out.println(toBinari);
	}
	static void toOctal(int decimal) {
		int rem=0;												//Reminder to store
		String toOct = "";										//String to store octal number
		System.out.print("Decimal "+ decimal+" to Octal : ");
		if(decimal==0)
			toOct = "0";
		while(decimal>0) {
			rem = decimal%8;									//dividing number by 8 and storing reminder
			decimal = decimal/8;								//dividing number by 8
			toOct = ""+rem+toOct;								//storing Octal Value
		}
//		toOct = rem + toOct;
		System.out.println(toOct);
	}
	static void toHexadecimal(int decimal) {
		int rem=0;												//Reminder to store
		String toHexa=""; 										//String to store HexaDecimal
		System.out.print("Decimal "+ decimal+" to HexaDecimal : ");
		if(decimal==0)
			toHexa = "0";
		while(decimal>0) {
			rem =decimal%16;									//dividing number by 16 and storing reminder
			decimal = decimal/16;								//dividing number by 16
										//storing HexaDecimal Value	
			switch(rem) {
			case 10:
				toHexa = ""+"A"+toHexa;
				break;
			case 11:
				toHexa = ""+"B"+toHexa;
				break;
			case 12:
				toHexa = " "+"C"+toHexa;
				break;
			case 13:
				toHexa = ""+"D"+toHexa;
				break;
			case 14:
				toHexa = ""+"E"+toHexa;
				break;
			case 15:
				toHexa = ""+"F"+toHexa;
				break;
			default:
					toHexa = ""+rem+toHexa;
			}
		}
//		toHexa = rem+toHexa;
		System.out.println(toHexa);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int number;												//Number
		Scanner scan = new Scanner(System.in);				
		System.out.println("Enter a decimal number :");		
		number = scan.nextInt();								//Taking Value from user
		toBinary(number);
		toOctal(number);
		toHexadecimal(number);
		
	}
}
