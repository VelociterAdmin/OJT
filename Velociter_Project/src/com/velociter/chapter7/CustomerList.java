package com.velociter.chapter7;

public class CustomerList {

	public static void main(String[] args) {
		String names[]={"Danish","Pratiksha","Shafiq","Dev"};
		System.out.println("List of customers:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		try {
		System.out.println(names[1]);
		System.out.println(names[5]);
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException");
		System.out.println(e.getStackTrace());
	   
	}
		 int id[]=null;
		 try {
		 System.out.println(id.length);
	 }
		 catch(NullPointerException e) {
			 System.out.println("NullPointerException");
			 System.out.println(e.getStackTrace());
		 }
		 try {
			 int arr[]=new int[-5];
			 System.out.println(arr[-5]);
			 
		 }
			
		 catch(NegativeArraySizeException e) {
			 System.out.println("NegativeArraySizeException");
			 System.out.println(e.getStackTrace());
		 }
		
		

}
}