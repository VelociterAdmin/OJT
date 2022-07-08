package com.velociter.chapter9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
// This program write for calculate the execution time; 
public class Test_ParallelMethod {
	
	public static void main(String[] args) throws IOException {
	   long start=0;
	    long end =0;
	
	      start=System.currentTimeMillis();
	      IntStream.range(1,100).parallel().forEach(System.out::println);
	      end=System.currentTimeMillis();
	      System.out.println(" Time calculate :"+(end-start));
	      	    
   }
}


