package com.velociter.exception;
/*
 * Add an exception class to the last example that will differentiate between the index-out-ofbounds error possibilities,
 * rethrow an appropriate object of this exception class in divide(), and handle the exception in main().
*/

public class ZeroDivideException extends Exception {
	private int index = -1;										//Index of array element cousing error

	public ZeroDivideException() {}								//Default constructor
	
	//Standard Constructor
	public ZeroDivideException(String s) {
		super(s);												//Call the base constructor
	}
	
	public ZeroDivideException(int index) {						
		super("/ by zero");										//Call the base constructor
		this.index = index;										//Set the index values
	}
	
	//Get the array index value for the error 	
	public int getIndex() {
		return index;											//Return index value
	}
	
}