package com.velociters.chapter8;
import java.io.IOException;
import java.util.Random;
//import java.lang.Math;
//import java.util.ArrayList;
public class RendomNumbers20 {
	// Chapter 8 Exercise
	public static void main(String[] args) throws IOException {
		int min=-50;
		int max=50;
		int array[]=new int[100];
		for(int i=0; i<=100;i++) {
		int array1[i]=(int)Math.floor(Math.random()*(max-min+1)+min);
	}
 }				
}		
		
		
		
		
		
		
	/*	int count = 0;                              //declaring integer count
		int array[]=new int[102];
		int array2[]=new int[21];
		int i;
		for(i=0; i<=100;i++) {
			array[i]=i-50;
			//System.out.println(array[i]);
		}
		for(int k=0; k<=array.length;k++) {
		
			array2[k]=(int)Math.random()*array[k];
			System.out.print(array2[k]+" ");
		
	
}
		for(int j=0 ; j<=19; j++) {       //using for loop to print data multiple times
		System.out.printf(" %1$4d",array[i]);
		if(++count%6 == 0) {                        //if incremented count is divided by 6 and gives reminder 0 change the line  
		System.out.printf("\n");
	}
   }
  }
}
*/