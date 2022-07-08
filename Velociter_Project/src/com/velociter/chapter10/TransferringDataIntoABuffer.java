package com.velociter.chapter10;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class TransferringDataIntoABuffer {

	public static void main(String[] args) {
		String text = "Value of e";
		ByteBuffer buf = ByteBuffer.allocate(text.length()+ sizeof(Math.E));
		buf.put(text.getBytes()).putDouble(Math.E);
		char[] array = text.toCharArray(); // Create char[] array from the string
		ByteBuffer buf2 = ByteBuffer.allocate(5); 
		// Now use a loop to transfer array elements one at a time
		for (char ch: array) {
		buf.putChar(ch);
		}
		buf.putDouble(Math.E); // Transfer the binary double value
		
	
	}

	private static int sizeof(double e) {
		// TODO Auto-generated method stub
		return 0;
	}

}
