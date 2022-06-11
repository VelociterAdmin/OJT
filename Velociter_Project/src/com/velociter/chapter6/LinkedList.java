package com.velociter.chapter6;

public class LinkedList {
  public static void list() {
	  Node node1=new Node();
	  node1.num=1;
	  
	  Node node2=new Node();
	  node2.num=2;
	  node1.next=node2;
	  
	  Node node3=new Node();
	  node3.num=3;
	  node2.next=node3;
	  
	  Node node4=new Node();
	  node4.num=4;
	  node3.next=node4;
	  
	  Node node5=new Node();
	  node5.num=5;
	  node4.next=node5;
	  
	  Node head=node1;
	  traverse(head);
	 		  
  }
  public static void traverse(Node head) {
	  Node temp=head;
	  System.out.println("Forward Traversing:");
	  for(temp=head;temp!=null;) {
		  System.out.print(temp.num+" ");
		  temp=temp.next;
	  }
 
	  }
 
	
}
	 
		  
	  
 
	  
  

