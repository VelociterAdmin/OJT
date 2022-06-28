package com.velociters.chapter8;
import java.io.IOException;
import java.util.Formatter;
import java.util.Random;
public class RendomNumByFormatter {
	// Chapter 8 Exercise
	public static void main(String[] args) throws IOException {
		Formatter f=new Formatter();
		int count=0;
		int i;                                      //declared an integer i
		double array[]=new double[20];                       //declared an array of type double
		for( i=0; i<=19;i++) {
			array[i]=(Math.random()*100-50);
			f.format("%1$10g",array[i]);
		}	
		System.out.println("20 Rendom numbers between -50 to 50 :");
		for( i=0 ; i<=19; i++) {                                       //using for loop to print data multiple times
		System.out.print("    "+array[i]);	
	}
  }
}



















/*
for( i=0 ; i<=19; i++) {       //using for loop to print data multiple times
//System.out.print(i+")");
System.out.printf("%1$6d",array[i]);
if(++count%5 == 0) {                        //if incremented count is divided by 6 and gives reminder 0 change the line  
System.out.printf("\n");
}*/