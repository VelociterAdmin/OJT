package com.velociter.chapter7;

public class Exception {
	public void exception() {
	int num=12;
	int i;
	int[] array= {1,2,0,3,0,4};

    for( i=0;i<array.length;i++) {
    	array[i]=Math.round(array[i]);
       }
    System.out.println(num/array[i]);
   }
 }
