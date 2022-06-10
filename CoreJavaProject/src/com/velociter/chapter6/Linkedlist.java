package com.velociter.chapter6;

public class Linkedlist{
	public static void list() {
		
		Node n1=new Node();
		n1.number=1;
		
		Node n2=new Node();
		n2.number=2;
		n1.next=n2;
		
		Node n3=new Node();
		n3.number=3;
		n2.next=n3;
		
		Node n4=new Node();
		n4.number=4;
		n3.next=n4;
		
		Node n5=new Node();
		n5.number=5;
		n4.next=n5;
		
		Node head=n1;
		traverse(head);
		
	}
	public static void traverse(Node head)
	{
		Node temp=head;
		System.out.println("Forward Traversing:");
		while(temp!=null) {
			System.out.print(temp.number+" ");
		    temp=temp.next;
		}
		/*
		System.out.println("Backword Traversing");
		while(temp!=head)
		{
			System.out.println(temp.number);
			temp=temp.next;
		}*/
	}
}


