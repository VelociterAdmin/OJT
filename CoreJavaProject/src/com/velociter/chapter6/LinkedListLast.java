package com.velociter.chapter6;
import java.util.LinkedList;
public class LinkedListLast {
	public static void main(String[] args) {
		 LinkedList<String> list= new LinkedList<String>();
         list.add("danish");
         list.add("shweta");
         list.add("dev");
         list.add("qureshi");
         list.add("mishra");

         LinkedList<String> list2= new LinkedList<String>();
         list2.add("danish");
         list2.add("shweta");
         list2.add("devendra");
         list2.add("qureshi");

        System.out.println(list.equals(list2));
        
    }
}
