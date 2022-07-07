package com.velociter.chapter10;

import java.nio.ByteBuffer;

public class BufferClass {

	public static void main(String[] args) {
		int capacity=250;
		int newLimit = 230;
		int newPosition = 200;
	 ByteBuffer buf = ByteBuffer.allocate(capacity); 
	buf.position(0).limit(newLimit).position(newPosition);
	 if(newPosition >= 0 && newLimit > newPosition) {
		 buf.position(0).limit(newLimit).position(newPosition);
		
		 } else 
		 {
			 System.out.println("Illegal position : limit setting."+"Position:" + newPosition +"Limit:"+newLimit);
		 } 
		 if (buf.hasRemaining())      // If limit-position is >0
		 { 
			 System.out.println(" We have space in the buffer!");
			
		 }
		 
	 System.out.println("the buffer can store "+buf.remaining()+"more elements");
	 
	}
}

