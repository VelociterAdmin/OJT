package com.velociter.chapter3;

import java.util.*;

public class IsPrimeWithSqrt {

	public static void main(String[] args) {
		System.out.println("Enter A Number Below:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if(isPrime(number)) {
			System.out.println(number+" is Prime");
		}else {
			System.out.println(number+" is not Prime");
		}
		
	}
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

}
