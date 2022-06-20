package com.velociter.chapter7;
import java.lang.Exception;

public class ZeroDivideException extends Exception{

	private int index=-1;
 public void ZeroDivideException() {
 
 }
 public ZeroDivideException(String s) {
	 super(s);
 }
	
public void ZeroDivideException(int index) {
	//super("/by zero");
	this.index=index;	
	}
 public int getIndex() {
	 return index;
 }
 public static int divide(int [] array,int index) throws ZeroDivideException {	
	 try {
		 System.out.println("First try block in divide() entered");
		 array[index + 2] = array[index]/array[index + 1];
		 System.out.println("Code at end of first try block in divide()");
		 return array[index + 2];
		}
	 catch(ArithmeticException e) {
		 System.out.println("Arithmetic exception caught in divide()");
		  }
	 catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("Index-out-of-bounds index exception caught in divide()");
		 }
	 finally {
		 System.out.println("Finally block in divide():");
	 }
	
	 return array[index + 2];
 }
	public static void main(String [] args) throws ZeroDivideException {
		int [] array= {10,5,0};
		try {
			System.out.println("result :"+divide(array,0));
			array[1]=0;
			System.out.println("result :"+divide(array,0));
			array[1]=1;
			System.out.println("result :"+divide(array,1));
		}
		catch(ZeroDivideException e) {
			int index=e.getIndex();
			if(index>0) {
			array[index]=1;
			System.out.println("Zero divisor "+ array[index]);
			}
		}
		catch(ArithmeticException e) {
		System.out.println("Arithmetic exception caught in main()");
		} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index-out-of-bounds exception caught in main()");
				}
		}
}

