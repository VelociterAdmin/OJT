package com.velociter.requirment;

public class BinaryConversion {
	public String binaryConversion(	int number) {
   String binary="";
 for(;number>=2;) {
	 binary=number%2+binary;
	 number=number/2;
}
 binary=number+binary;
 System.out.println("Conversion in binary="+binary);
return null;
 
	}
}