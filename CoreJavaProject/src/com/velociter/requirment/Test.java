package com.velociter.requirment;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.IntStream;

public class Test {
	
	public static void main(String[] args)  throws IOException {
		timeCalculation time=new timeCalculation();
		
	}
	

	public  void timeCalculation () {
		long startTime=0;
		long endTime=0;
		 startTime=System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
		endTime=System.currentTimeMillis();
		System.out.println("time taken="+(endTime-startTime));
		                                                                      
		    }
		}
