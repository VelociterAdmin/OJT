package com.velociter.requirment;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.IntStream;
//it is a program to calculate the time in printing 1 to 1000 numbers and reducing the execution time of program
public class Test {

	public static void main(String[] args)  throws IOException {
		Test t=new Test();
		t.timeCalculation2();
		t.timeCalculation();
		
	}
	
	public void timeCalculation2() {
		double startTime=0;
		double endTime=0;
		startTime=System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::println);
		endTime=System.currentTimeMillis();
		System.out.println("time taken="+(endTime=endTime-startTime)+" millisecond");
	}

	public  void timeCalculation () {
		double startTime=0;                                             //variable to get start time
		double endTime=0;                                               //variable to get end time
		 startTime=System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
		endTime=System.currentTimeMillis();
		System.out.println("time taken="+(endTime=endTime-startTime)+" millisecond");
		                                                                      
		    }
	}
