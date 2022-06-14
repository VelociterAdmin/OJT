package com.velociter.chapter7;

public class TryBlock {
	
 public static void main (String[]args){
	 int arr[]=new int[5];
	 try {

		 for(int j=0;j<6;j++) {
			 System.out.println(arr[j]);
		 }
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("ArrayIndexOutOfBoundsException");
	 }
 }

}
