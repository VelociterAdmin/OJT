package com.velociter.chapter7;

public class Customer {

	public static void main(String[] args) {
		 int id[]=null;
		 try {
		 System.out.println(id.length);
	 }
		 catch(NullPointerException e) {
			 System.out.println("NullPointerException");
		 }

	}
}