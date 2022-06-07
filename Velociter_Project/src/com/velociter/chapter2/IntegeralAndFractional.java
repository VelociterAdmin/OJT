package com.velociter.chapter2;

public class IntegeralAndFractional {

	public static void main(String[] args) {
		double variable = 1234.5678;
	    long integPart = 0;
	    short fracPart = 0;
	
	    integPart = (long)variable;
	 
	    fracPart = (short)((variable - integPart)*Math.pow(10, 4));
	    System.out.println("integral part of " + integPart);
	    System.out.println("fractional part to " + fracPart);
	   
	}

}
