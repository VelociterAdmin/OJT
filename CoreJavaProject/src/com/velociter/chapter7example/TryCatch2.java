package com.velociter.chapter7example;

public class TryCatch2 {
	public static void main(String[] args) {
		int array[]=new int[5];
		try{
			for(int k=0;k<=6;k++){
		
			System.out.println(array[k]);
		}
	
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Tt is an ArrayIndexOutOfBoundsException");
   }
 }
}


