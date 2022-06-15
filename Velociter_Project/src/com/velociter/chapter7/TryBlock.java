package com.velociter.chapter7;

public class TryBlock {
	
 public static void main (String[]args){
	
	 try {
		 int arr[]=new int[-5];
		 System.out.println(arr[-5]);
		 
	 }
		
	 catch(NegativeArraySizeException e) {
		 System.out.println("NegativeArraySizeException");
	 }
	 
}
}