package com.velociter.exception;

/*
 * Write a program that will generate exceptions of type NullPointerException,
 * NegativeArraySizeException, and IndexOutOfBoundsException. Record the catching of
 * each exception by displaying the message stored in the exception object and the stack trace record.
*/

public class Null_Negative_IndexOutOfBond_Exception {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int[] array = null;
		int x ;

		for(int select = 1; select < 4; select++) {
			try{
				switch(select){		
				case 1:
					x = array[0];										//Null value assigned to variable 'a'
					break;
				case 2:
					array = new int[-2];								//Negative Array Size assigned 
					break;
				case 3:
					array = new int[2];									//Index out of bound 
					x = array[3];
					break;
					}
				}
			catch(NullPointerException nE) {							//NullPointerException caught
				System.out.println("Null Pointer Exception");
				System.out.println(nE.getStackTrace());
				}
			catch(NegativeArraySizeException nAE) {						//NgativeArraySizeException cought
				System.out.println("Negative Array Size Exception");
				System.out.println(nAE.getStackTrace());
			}
			catch(IndexOutOfBoundsException iE) {						//Index Out of Bound Exception
				System.out.println("Index Out of Bond Exception");
				System.out.println(iE.getStackTrace());
			}
		}	
	}
}