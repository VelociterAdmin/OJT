package com.velociter.chapter4;

import java.util.Scanner;

public class ReverseTheSequenceOfLetter {
	
	public static void main(String[] args) {
		   
		        String paragraph = "To be or not to be ";
		        String reverse="" ;
		        char ch = ' ';
		       
		        int str = 0;
		        int index=0;
		       
		        System.out.println("String paragraph :  " + paragraph);
		       
		          for(int i=0; i<paragraph.length();i++ )
		        {
		       
		            index = paragraph.indexOf(ch,str);
		           
		            for(int j=index-1; j>=str; j--)
		            {
		                reverse += paragraph.charAt(j);
		                               
		            }
		           
		            if(index != -1)
		            {   
		                str = index+1;
		                i= str;
		                reverse += " ";
		                 
		            }
		            else
		                break;           
		               
		        }
		   
		        for(int n=paragraph.length()-2; n>=str; n--)
		            reverse += paragraph.charAt(n);
		            
		        System.out.println("Reverse string paragraph :  "+reverse);
	}      
	}

