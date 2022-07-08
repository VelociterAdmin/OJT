package com.velociter.chapter10example;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Test {

	public static void main(String[] args) {
		String saying="Handsome is as handsome does.";
        byte [] array= saying.getBytes();
        for(int i=0; i<=array.length-1;i++)
        {
     	   System.out.println(array[i]);   
        }
       ByteBuffer buf=ByteBuffer.wrap(array,9,14);
     //  buf.duplicate();
      
       String myName="my name is danish qureshi";
       CharBuffer charbuffer=CharBuffer.wrap(myName);
       System.out.println(charbuffer.duplicate());
       System.out.println(charbuffer.slice());
	}

}
