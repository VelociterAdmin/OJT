package com.velociter.chapter13;

public class TestManager {

	public static void main(String[] args) {
	BinaryTree<Manager>people=new BinaryTree<Manager>();
	Manager[]managers = {new Manager("Shweta",5),new Manager("Monika",8),new Manager("Dishu",9),new Manager("Yogita",10)};
	
	for(Manager manager:managers) {
		people.add(manager);
		System.out.println(manager);
	}
	System.out.println();
	listAll(people.sort());
	}

	public static void listAll(LinkedList<?> sort) {
		for(Object obj :sort) {
			System.out.println(obj);
		
	}
		

	}

}
