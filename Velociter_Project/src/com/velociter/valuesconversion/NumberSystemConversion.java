package com.velociter.valuesconversion;
import java.util.Scanner;

public class NumberSystemConversion {
		
 public void getDecimalToBinary(int num) {
	
	 String binary="";
	
  while(num>=2)
	{
		binary=num%2+binary;
		num=num/2;
		}
	  binary=num+binary;
	  System.out.println("Convert to binary :"+binary);
	}
	public void getDecimalToOctaDecimal(int num) {
		
		String octadecimal="";
		
		while(num>=8)
		{
			octadecimal=num%8+octadecimal;
			num=num/8;
			}
	  octadecimal=num+octadecimal;
		System.out.println("Convert to OctaDecimal:"+octadecimal);
		
		}
	public void getDecimalToHexaDecimal(int num) {
	
	String HexaDecimal="";
	if(num==0) {
		System.out.println("Convert to Hexadecimal:"+num);
	}
	else {	
	
	
	while(num>0)
	{
	int hexa;	
	  hexa=num%16;
	  num=num/16;
	  switch(hexa) {
	  case 10:
		  HexaDecimal="A"+HexaDecimal;
		  break;
	  case 11:
		  HexaDecimal="B"+HexaDecimal;
		  break;
	  case 12:
		  HexaDecimal="C"+HexaDecimal;
		  break;
	  case 13:
		  HexaDecimal="D"+HexaDecimal;
		  break;
	  case 14:
		  HexaDecimal="E"+HexaDecimal;
		  break;
	  case 15:
		  HexaDecimal="F"+HexaDecimal;
		  break;
	  default:
		  HexaDecimal=hexa+HexaDecimal;
		  break; 
	  
	  }
	
	}
	System.out.print("Convert to Hexadecimal:"+HexaDecimal);
	  
		//System.out.println((num == 0 ? "0" :""));
	}
}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Decimal values:");
		int num=scanner.nextInt();
		NumberSystemConversion convert=new NumberSystemConversion();
		convert.getDecimalToBinary(num);
		convert.getDecimalToOctaDecimal(num);
		convert.getDecimalToHexaDecimal(num);
	}
	
}
