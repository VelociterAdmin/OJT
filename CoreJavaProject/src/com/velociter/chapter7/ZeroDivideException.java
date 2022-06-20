package com.velociter.chapter7;

public class ZeroDivideException extends Exception {
		private int index = -1; 
		public ZeroDivideException(){ }
		public ZeroDivideException(String s) {
			super(s); 
			}
			public ZeroDivideException(int index) {
			super("/by zero");
			this.index = index; 
			}
			
			public int getIndex() {
			return index; 
			}
			public static int divide(int[] array, int index) throws ZeroDivideException {
				try {
					System.out.println("\nFirst try block in divide() entered");
					array[index + 2] = array[index]/array[index + 1];
					System.out.println("Code at end of first try block in divide()");
				
							return array[index + 2];
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic exception caught in divide()");
				} 
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Index-out-of-bounds exception caught in divide()");
					} 
				finally {
					System.out.println("finally block in divide()");
					}
					System.out.println("Executing code after try block in divide()");
					return array[index + 2];
					}
			public static void main(String[] args) throws ZeroDivideException {
				int[] x = {10, 5, 0}; 
				try {
				System.out.println("First try block in main() entered");
				System.out.println("result = " + divide(x,0)); 
				x[1] = 0; 
				System.out.println("result = " + divide(x,0));
				x[1] = 1;
				System.out.println("result = " + divide(x,1));
				}
				catch(ZeroDivideException e) {
					int index = e.getIndex(); 
					if(index > 0) {
					x[index] = 1;
					x[index + 1] = x[index - 1]; 
					System.out.println("Zero divisor corrected to " + x[index]);
					}
				}
				catch(ArithmeticException e) {
					System.out.println("Arithmetic exception caught in main()");
					} 
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Index-out-of-bounds exception caught in main()");
					}

				System.out.println("Outside first try block in main()");
					
		}
}
		