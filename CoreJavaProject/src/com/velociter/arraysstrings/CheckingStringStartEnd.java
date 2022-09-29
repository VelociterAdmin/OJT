package com.velociter.arraysstrings;
// Chapter 4 Example : Checking the Start and End of a String
public class CheckingStringStartEnd {

	public static void main(String[] args) {
		String string1 = "Java is a programming language"; 				//String Variable Created
		if(string1.startsWith("Java")){									//Checking string1 that it start with Java
			System.out.println("String start with \"Java\" too! ");		//Yes Print Yess
		}
		else {
			System.out.println("String doesn't start with \"Java\"");	//No Print No
		}
	}

}
