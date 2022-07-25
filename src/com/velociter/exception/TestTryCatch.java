package com.velociter.exception;

public class TestTryCatch {

	public static void main(String[] args) {
		int i=1,j=0;
//		j++;
		try {																//Try block
			System.out.println("Try Block Entered: i = "+i+", j = "+j);
			System.out.println(i/j);										//dividing by 0 - exception thrown
			System.out.println("Ending Try Block");		
			
		}catch(Exception e) {									
			System.out.println("Arthmatic Exception cought");				//catching exception
		}
		System.out.println("After Try Block");
		return;
	}
}
