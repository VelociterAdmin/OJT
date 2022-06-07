package com.velociter.chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class SortingString {

	//public static void main(String[] args) {
	    String[] str={"Sunday","Monday","Tuesday","Thursday","Friday","Saturday"};
		  int i,j;
		  String tmp;
		
	       public void Ascending() {
	        for ( i = 0 ; i < str.length ; i++) {
	            for(j = 0 ; j < str.length-i-1 ; j++) {

	                if  (str[j].compareTo(str[j+1])<0) {
	                    tmp = str[j];
	                    str[j] = str[j+1]; 
	                    str[j+1] = tmp;
	                }
	            }
	        
	            System.out.println(str[j]);
	        }
	       }
	        
	        //System.out.println("Sorted Strings:");
	        public void Descending() {
	        for ( i = 0 ; i < str.length ; i++) {
	            for (j = 0 ; j < str.length-i-1 ; j++) {

	                if (str[j].compareTo(str[j+1])>0) {
	                    tmp = str[j];
	                    str[j] = str[j+1]; 
	                    str[j+1] = tmp;
	                }
	            
	        }
	 


	           System.out.println(str[j]);
	        }
	        }


	     public static void main(String[] args) {
	        	SortingString obj=new SortingString();
	        	
	        	Scanner sc=new Scanner(System.in);
	        	//System.out.println("please enter a number");
	        	
	        	System.out.println("Select option to perform operation \n 1: ascending order \n 2: descending order ");
	        	int option=sc.nextInt();
	        	if(option==1) {
	        		obj.Ascending();
	        	}
	        
	        	else {
	        		if(option==2) {
	        		obj.Descending();
	        			}
	        	}
	     }	
	    
	     }
		
		  



