package com.velociter.chapter6;

public class Experimental {
	
//    private static void printLength(String str) {
//        System.out.println(str.length());
//    }

    public static void main(String args[]) {
        String myString = null;
        try {
        System.out.println(myString.length());
        System.out.println("Shafique");
        }
        catch(NullPointerException e) {
//			e.printStackTrace();	
/*
 * java.lang.NullPointerException: Cannot invoke "String.length()" because "myString" is 
 * at com.velociter.chapter6.Experimental.main(Experimental.java:12)
*/
//        	System.out.println(e.getMessage());
//        	Cannot invoke "String.length()" because "myString" is null

        	System.out.println(e);
//		java.lang.NullPointerException: Cannot invoke "String.length()" because "myString" is null

        }
    }
}