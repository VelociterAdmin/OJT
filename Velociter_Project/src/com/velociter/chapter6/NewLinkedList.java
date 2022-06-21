package com.velociter.chapter6;
import java.util.LinkedList;
public class NewLinkedList {
	public static void main(String[]args) {
	 LinkedList<Integer> list = new LinkedList<Integer>();
	  
     list.add(5);
     list.add(8);
     list.add(13);
     list.add(25);
     list.add(20);
     System.out.print("Forward Traversing: " + list);

     
    list = reverseLinkedList(list);
     System.out.print("\n Backward Traversing: " + list);
 }


 public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list)
 {
     for (int i = 0; i < list.size() / 2; i++) {
         Integer temp = list.get(i);
         list.set(i, list.get(list.size() - i - 1));
         list.set(list.size() - i - 1, temp);
     }

       return list;
 }
}
