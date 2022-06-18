package com.velociter.chapter7;

public class ZeroDivideException extends Exception{
	
	private int index=-1;
	
 public void ZeroDivideException(int index) {

	this.index=index;	
	}
 public int getIndex() {
	 return index;
 }
public static int divide(int[]array,int index) throws ZeroDivideException{
	try {
		System.out.println("First try block divide() entered:");
		array[index + 2]=array[index]/array[index + 1];
	     return array[index+2];
	}
	     catch(ArithmeticException e) {
	    	System.out.println("ArithmeticException caught in divide()");
	    	throw new ZeroDivideException();
	     }
}
public static void main(String[] args) {
	int[]x= {10,5,0};
	try {
		System.out.println("First try block in main() entered");
		System.out.println("result =" + divide(x,0)); 
		x[1] = 0; 
		System.out.println("result =" + divide(x,0)); 
		x[1] = 1; 
		System.out.println("result =" + divide(x,1));
	}

	catch(ArithmeticException e) {
		System.out.println("Arithmetic exception caught in main():");
}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException caught in main():");
	}

}

