package com.velociter.chapter6;
import java.util.*;
public class NewLinkedList {

	public static void main(String[] args) {
		
			LinkedList <Integer> list=new LinkedList();
			list.add(22);
			list.add(33);
			list.add(42);
			list.add(5);
			list.add(12);
			list.addLast(2);
			list.addFirst(5);
			list.add(3, 50);
			System.out.println("Actual List:");
			System.out.println(list);
			list.remove(2);
			list.remove(5);
			System.out.println("List After Removing Elements");
			System.out.println(list);
			
	}
}


	


