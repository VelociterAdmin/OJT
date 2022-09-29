package com.velociter.generics;

import java.util.Iterator;

public class TryFilexibleBinaryTree {

	public static void main(String[] args) {
		BinaryTree<Manager> people = new BinaryTree<Manager>();
		Manager[] managers = {new Manager("Shafeeque",2),new Manager("Shweta",3),new Manager("Danish",1)};
		
		for(Manager manager : managers) {
			people.add(manager);
			System.out.println("Added "+manager);
		}
		System.out.println();
		listAll(people.sort());
	}
	
	//list the element in any linked list
	public static void listAll(LinkedList<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
		

	}
}
