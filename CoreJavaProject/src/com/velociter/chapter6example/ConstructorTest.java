package com.velociter.chapter6example;

public class ConstructorTest {
    int b;
	int c;
	int d;
     ConstructorTest(int a){
    	 b=4;
    	System.out.println( a=b);
     }
     ConstructorTest(int[]k){
    	 System.out.println("hi im con. with arry");
     }
     public static void main(String[] args) {
		ConstructorTest con=new ConstructorTest();
		
	}
}
