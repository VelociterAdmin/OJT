package com.velociter.chapter10;

import java.nio.ByteBuffer;
//3 Example of chapter 10
//allocating a new capacity of size and position to bytebuffer and checking whether there space is left;
public class BufferClass {

	public static void main(String[] args) {
		int capacity=250;           //initialize the capacity
		int newLimit = 230;         //initialize the newLimit
		int newPosition = 200;      //initialize the newPosition
	//create a new buffer using the allocate() method for the buffer class
	ByteBuffer buf = ByteBuffer.allocate(capacity); 
	// position is zero, and its limit will be set to its capacity 
	buf.position(0).limit(newLimit).position(newPosition);
	 if(newPosition >= 0 && newLimit > newPosition) {
		 buf.position(0).limit(newLimit).position(newPosition);
		
		 } else 
		 {
			 System.out.println("Illegal position : limit setting."+"Position:" + newPosition +"Limit:"+newLimit);
		 } 
	 // hasRemaining method return the number of elements between the current position and the limit
		 if (buf.hasRemaining())      // If limit-position is >0
		 { 
			 System.out.println(" We have space in the buffer!");
			
		 }
		 
	 System.out.println("the buffer can store "+buf.remaining()+"more elements");
	 
	}
}

