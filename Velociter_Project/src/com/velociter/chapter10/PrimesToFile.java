package com.velociter.chapter10;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.channels.FileChannel;
import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;
import static java.lang.Math.min;


public class PrimesToFile {
	
	public static void main(String[] args) {
		int primesRequired = 100;       // Default count
		if (args.length > 0) {
		try {
		primesRequired = Integer.valueOf(args[0]).intValue();
		} catch (NumberFormatException e) {
		System.out.println("Prime count value invalid. Using default of "+ primesRequired);
		}
		}
		long[] primes = new long[primesRequired];    // Array to store primes
		primes[0] = 2;                //  the first prime
		primes[1] = 3;               // and the second
		// Count of primes found – up to now, which is also the array index
		//int count = 2;
		// Next integer to be tested
		long number = 5;
		outer:
		for (int count = 2; count < primesRequired; number += 2) {
	   // The maximum divisor we need to try is square root of number
		
		long limit = (long)ceil(sqrt((double)number));
		// Divide by all the primes we have up to limit
		for (int i = 1; i < count && primes[i] <= limit; i++)
		if (number % primes[i] == 0)           // Is it an exact divisor?
		continue outer;                       // yes,try the next number
		primes[count++] = number;         
		}
	}
}
	
	
