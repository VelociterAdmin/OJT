package com.velociter.requirment;
import java.util.Scanner;                   //imported Scanner Class 
public class Conversion {
	  public void binaryConversion(int number) {
      String binary="";
      for(;number>=2;) {
	  binary=number%2+binary;
	  number=number/2;
      }
      binary=number+binary;
      System.out.println("Conversion in binary="+binary);
    }
		public void ocatlConversionin(int number) {
			 String octal="";
			 for(number=number;number>=8;) {
				 octal=number%8+octal;
				 number=number/8;
		}
			 octal=number+octal;
			 System.out.println("Conversion in octal="+octal);
			}
		public void hexaDecimal(int number) {
			 String hexadecimal="";
			 int temp=0;
			 for(number=number;number>0;) {
				
				temp =number%16;
				 number=number/16;
				 switch(temp) {
				 case 10:
					 hexadecimal=" "+"A"+hexadecimal;
					 break;
				 case 11:
					 hexadecimal=" "+"B"+hexadecimal;
					 break;
				 case 12:
					 hexadecimal=" "+"C"+hexadecimal;
					 break;
				 case 13:
					 hexadecimal=" "+"D"+hexadecimal;
					 break;
				 case 14:
					 hexadecimal=" "+"E"+hexadecimal;
					 break;
				 case 15:
					 hexadecimal=" "+"F"+hexadecimal;
					 break;
				 default:
					 hexadecimal=" "+temp+hexadecimal;
					
		 }
//			 hexadecimal=temp+hexadecimal;
			// System.out.print("Conversion in hexadecimal="+hexadecimal);
			 }
			 System.out.print("Conversion in hexadecimal="+hexadecimal);
		}	 
		public static void main(String[] args) {
			System.out.println("Enter a number:");
			Scanner scan=new Scanner(System.in);
			int num=0;
			num=scan.nextInt();
			Conversion con=new Conversion();
			con.binaryConversion(num);
			con.ocatlConversionin(num);
			con.hexaDecimal(num);
		}
 }