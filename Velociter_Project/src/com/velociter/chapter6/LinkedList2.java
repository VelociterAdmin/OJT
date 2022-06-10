package com.velociter.chapter6;
import java.util.LinkedList;
public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Inserting the elements:");
		list.add(20);
		list.add(15);
		list.add(10);
		list.add(30);
		list.add(25);
		list.add(3,22);
		list.add(5, 35);
		list.addFirst(65);
		list.addLast(70);
		System.out.println(list);
		System.out.println("After deleting the elements:");
		list.remove();
		list.remove(5);
		System.out.println(list);

	}

}
