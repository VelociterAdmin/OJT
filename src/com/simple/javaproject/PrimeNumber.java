package com.simple.javaproject;

public class PrimeNumber {

	public static void main(String[] args) {

		int nValue=50;
		boolean isPrime=true;
		for(int i=2;i<=nValue;i++) {
			isPrime=true;
			for(int j=2;j<Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println((int)i);
			}
				
		}
	}

}
