package com.velociter.chapter10example;

public class Test {

	public static void main(String[] args) {
		buf.position(0).limit(newLimit).position(newPosition);
		if(newPosition >= 0 && newLimit > newPosition) {
			buf.position(0).limit(newLimit).position(newPosition);
			} else {
			System.out.printn("Illegal position:limit settings"+ "Position: " + newPosition + " Limit: "+ newLimit);
			}
		if (buf.hasRemaining()) {                                                  // If limit-position is >0
			System.out.println("We have space in the buffer!");
			}
       
	}

}
