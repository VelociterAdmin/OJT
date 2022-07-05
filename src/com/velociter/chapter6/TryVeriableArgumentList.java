package com.velociter.chapter6;

public class TryVeriableArgumentList {

	public static void main(String[] args) {
		printAll(2, "Two", 4, "Four", 4.5, "Four point five");				//Six Argument
		printAll();															//no Argument
		printAll(26, "Anything goes",true, 4E4, false);						//five Argument
		
		
	}

	public static void printAll(Object ...args) {
		for(Object arg : args) {
			System.out.print("  "+arg);
		}
		System.out.println();
	}
	
}
