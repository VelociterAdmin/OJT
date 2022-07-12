package com.velociter.chapter10;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
// 4 Example of Chapter 10;
public class TransferringDataIntoABuffer {

	public static void main(String[] args) {
		String text = "Value of e";
		ByteBuffer buf = ByteBuffer.allocate(50); // The original byte buffer
		CharBuffer charBuf = buf.asCharBuffer(); // Create view buffer
		charBuf.put(text); // Transfer string via view buffer
		// Update byte buffer position by the number of bytes we have transferred
		buf.position(buf.position() + 2*charBuf.position());
		buf.putDouble(Math.E); // Transfer binary double value
		
	}
}