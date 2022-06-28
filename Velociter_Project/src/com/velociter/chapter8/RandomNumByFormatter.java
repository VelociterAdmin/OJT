package com.velociter.chapter8;
import java.io.IOException;
import java.util.Formatter;

public class RandomNumByFormatter {

	public static void main(String[] args) {
	Formatter formate=new Formatter();   //create object of formatter class.
	int min = -50;  
	int max = 50;
	int  count=0;
	int i;
	double array[]=new double[21];
	System.out.println("Random value of type double between "+min+" to "+max+ ":"); 
	for( i=0;i<20;i++) {
	array[i]= Math.random()*(max-min+1)+min; 
	formate.format("%1$8g",array[i]);
	}
	for(i=0;i<20;i++) {
		System.out.print("  "+array[i]);
	}
		}
	
	}  	
	


