package com.velociter.chapter8;

import java.util.Random;

public class RandomNumGenerate {

	public static void main(String[] args) {
		int min = -50;  
		int max = 50;
		int  count=0;
		int i;
		System.out.println("Random value of type double between "+min+" to "+max+ ":"); 
		for( i=1;i<21;i++) {
		double d= Math.random()*(max-min+1)+min; 
		System.out.printf(i  +")"+ d + "  "); 
		if(++count%5 == 0) {
		System.out.printf("\n");
		}
			}
		
		}  	
		}
	

	


