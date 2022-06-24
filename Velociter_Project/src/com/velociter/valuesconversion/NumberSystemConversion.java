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
	
	while(num>16)
	{
		
	  HexaDecimal=num%6+HexaDecimal;
	  num=num/16;
	
	}
	  HexaDecimal=num+HexaDecimal;
		System.out.println("Convert to HexaDecimal :"+HexaDecimal);
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
