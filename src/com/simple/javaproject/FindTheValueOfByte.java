package com.simple.javaproject;

/* Write a console program to define and initialize a variable of type byte to 1, and then
successively multiply it by 2 and display its value 8 times. Explain the reason for the last result. */
public class FindTheValueOfByte {

	public static void main(String[] args) {
		byte byte1 = 1;						//Byte variable Created
		for(int i=0;i<8;i++) {
			System.out.println("Byte value is\t:\t"+byte1);
			byte1 = (byte) (byte1*2);
		}
	}

}
