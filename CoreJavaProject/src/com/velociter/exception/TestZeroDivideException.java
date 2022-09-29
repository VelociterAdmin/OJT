package com.velociter.exception;

public class TestZeroDivideException {
	public static int divide(int [] array,int index) throws ZeroDivideException{
		try {
			System.out.println("First try block in divide() entered");
			array[index+2] = array[index]/array[index+1];
			System.out.println("Code at end of first try block in divide()");
			return array[index+2];
		}
		catch(ArithmeticException aE) {
			System.out.println("Arithmatic Exception cought in divide()");
			throw new ZeroDivideException(index+1);							//Throw new Exception
		}
		catch(IndexOutOfBoundsException iE) {
			System.out.println("Index out of bounds exception cought in divide() ");
				
		}
		System.out.println("Executing code after try block in divide()");
		return array[index+2];
	}
	public static void main(String[] args) {
		int[] x= {1,5,0};													//Array of 3 integer
		//this block only throws enxception if divide() does	
		try {
			System.out.println("First try block entered in main()");
			System.out.println("result :"+divide(x, 0));					//No Error
			x[1] = 0;														//Will couse a divie 	
			System.out.println("result :"+divide(x, 0));
			x[1] = 1;
			System.out.println("result :"+divide(x, 1));
		}
		catch(ZeroDivideException zE) {
			int index = zE.getIndex();										//Get the index for error
			if(index>0) {													//Varify its valid and now fix the array
				x[index] = 1;												// ....set the divisor to 1
				x[index +1] = x[index-1];									// ....and the result
				System.out.println("Zero divisor corrected to "+x[index]);
			}
			
		}
		catch(ArithmeticException aE) {
			System.out.println("Arithmetic Exception cought in main()");
		}
		catch(ArrayIndexOutOfBoundsException aE) {
			System.out.println("Index-Out-Bounds Exception is cought in main()");
		}
		System.out.println("outside first try block in main()");
	}
}