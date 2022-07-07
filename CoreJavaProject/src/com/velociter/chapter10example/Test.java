package com.velociter.chapter10example;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Test {

	public static void main(String[] args) {
		String saying="Handsome is as handsome does.";
        byte [] array= saying.getBytes();
        for(int i=0; i<=array.length;i++)
        {
     	   System.out.println(array[i]);   
        }
       ByteBuffer buf=ByteBuffer.wrap(array,9,14);
      
       String myName="danish qureshi";
       CharBuffer charbuffer=CharBuffer.wrap(myName);
       
	}

}
