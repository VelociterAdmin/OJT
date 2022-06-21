package com.velociter.chapter6;

import java.util.LinkedList;

public class Equal_Method {
	public static void main(String[] args) {

	 LinkedList<String> list1= new LinkedList<String>();
     list1.add("Medi-Caps");
     list1.add("Velociter");
     list1.add("Amstech");
     list1.add("TCS");
     list1.add("Coder");

     LinkedList<String> list2= new LinkedList<String>();
     list2.add("Medi-Caps");
     list2.add("Velociter");
     list2.add("TCS");
     list2.add("Amstech"); 
    
   
     if(list2.equals(list1)) {
    	 System.out.println("true");
     }
     else {
    	 System.out.println("false");
     }
}
	
}
