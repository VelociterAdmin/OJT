package com.velociter.looplogic;

/* When testing whether an integer is a prime, it is sufficient to try to divide by integers up to the
 * square root of the number being tested. Rewrite the program example from this chapter to use	
 * this approach. */

public class IsPrimeOrNotSqrt {

	public static void main(String[] args) {
			int nValue=50;
			boolean isPrime=true;
			for(int i=2;i<=nValue;i++) {
				isPrime=true;
				for(int j=2;j<=(Math.sqrt(i));j++) {
					if(i%j==0) {
						isPrime=false;
						break;
					}
				}
			
				if(isPrime)
					System.out.println(i);	
			}
		}

}
