package com.velociter.definingclasses;

public class InitializeBlock {
	static int[] values = new int[10];
	
	static {
		System.out.println("Static Block");
		System.out.println("Running initialization Block");
		for(int i=0; i<10; i++) {
			values[i] = (int) (100.0*Math.random());
//			System.out.print(values[i]+" ");
		}
		
	}
	static void listValues() {
	System.out.println();
		for(int value : values) {
			System.out.print(" "+value);
		}
	System.out.println();
	}
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("\n No Object");
		InitializeBlock.listValues();
		InitializeBlock iB = new InitializeBlock();
		System.out.println("\n First objects");
		iB.listValues();
		iB = new InitializeBlock();
		System.out.println("\n Second objects");
		iB.listValues();
	}

}
