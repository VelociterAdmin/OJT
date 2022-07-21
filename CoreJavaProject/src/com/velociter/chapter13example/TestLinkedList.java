package com.velociter.chapter13example;

public class TestLinkedList {
	public static void main(String[] args) {
		//Pair<Double,Double> p=new Pair<Double,Double>(5.0, 6.0);
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.addItem(5);
		list.addItem(6);
		list.addItem(8);
		list.getFirst();

		Integer num=null;
		System.out.println(list.getNext());
        System.out.println(list.getFirst());
		while((num=list.getNext())!=null) {
			System.out.println(num);
		}
	}

}
