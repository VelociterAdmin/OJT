package com.velociter.chapter2;

public class IntigralAndFractional {

	public static void main(String[] args) {
		double mainValue=1234.5678;
		
		long integralValue=0;
		
		short fractionalValue=0;
		
		integralValue=(long)mainValue;
		
		fractionalValue=(short)((mainValue-integralValue)*Math.pow(10, 4));
		
		System.out.println("main value:          " +mainValue+"\n"+"intigral value is:   "+integralValue);
		System.out.println("fractional value is: "+fractionalValue);
		
		
	/**	int z=5;
	    z =z<<2;
	    System.out.println(z) */
	}

}


