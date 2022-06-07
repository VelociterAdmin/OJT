package com.velociter.chapter4;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	//public static void main(String[] args) {
		String[] text = {"my","name","is","danish"} ;
		int i,j;
		String s;
		public void Ascending()
		{
			for(i=0;i<text.length;i++)
			{
				for(j=0;j<text.length-i-1;j++) {
					if(text[j].compareTo(text[j+1])<0) {
						s=text[j];
						text[j]=text[j+1];
						text[j+1]=s;
				}
			}
				System.out.println(text[j]);
		}
	}
		public void Descending()
		{
			for(i=0;i<text.length;i++)
			{
				for(j=0;j<text.length-i-1;j++) {
					if(text[j].compareTo(text[j+1])>0) {
						s=text[j];
						text[j]=text[j+1];
						text[j+1]=s;
				}
			}
				System.out.println(text[j]);
		}
	}
		public static void main(String[] args) {
 
 
	 Sorting S=new Sorting();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("choose option\n 1:Ascending order \n 2: Descending order");
	 int option=sc.nextInt();
	 if(option==1) {
		 S.Ascending();
	 }
	 else {
		 
			 S.Descending();
		 
	 }
	 
 }
		
}
