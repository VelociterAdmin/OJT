package com.velociter.chapter10;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.LongBuffer;

public class WrappingArray {

	public static void main(String[] args) {
		String saying="Handsome is as handsome does";
		byte[]array=saying.getBytes();
		ByteBuffer buf = ByteBuffer.wrap(array, 9, 14);
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(array[i]);
		}
		
		}

}
