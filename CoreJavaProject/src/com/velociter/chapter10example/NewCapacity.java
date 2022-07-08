package com.velociter.chapter10example;

import java.nio.ByteBuffer;
//example of chapter 10
//allocating a new capacity of size and position to bytebuffer and checking whether there is space left. 
public class NewCapacity {

	public static void main(String[] args) {
		int oldSpace=1024;                                            // defined three integers oldspace,newspace and newposition
	    int newLimit=10;
	    int newPosition=5;
	    ByteBuffer buf=ByteBuffer.allocate(oldSpace);              //created a variable buf of class type 
	    buf.limit(newLimit).position(newPosition);
	    if(newPosition >= 0 && newLimit > newPosition) {
	    	buf.limit(newLimit).position(newPosition);
	    	} 
	    else {
	    	System.out.println("Illegal position:limit settings."+ "Position: " + newPosition + " Limit: "+ newLimit);
	    	}
	    if (buf.hasRemaining()) {                                                   // If limit-position is >0
	    	System.out.println("We have space in the buffer!");
	    	}
	    System.out.println("The buffer can store " + buf.remaining() +" more elements.");
	}
}

