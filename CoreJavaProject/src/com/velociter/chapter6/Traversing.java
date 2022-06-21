package com.velociter.chapter6;
import java.util.LinkedList;
public class Traversing {
	public static void main(String[]args) {
		LinkedList<Integer> linkedli = new LinkedList();
		 
		     linkedli.add(10);
		     linkedli.add(20);
		     linkedli.add(30);
		     linkedli.add(40);
		     linkedli.add(50);
		     System.out.print("forword traversing: " + linkedli);

		     
		     linkedli = reverseLinkedList(linkedli);
		     System.out.print("\nbackword traversing: " + linkedli);
		 }


		 public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
		 {
		     for (int i = 0; i < llist.size() / 2; i++) {
		         Integer temp = llist.get(i);
		         llist.set(i, llist.get(llist.size() - i - 1));
		         llist.set(llist.size() - i - 1, temp);
		     }
		     return llist;
		 }


}
