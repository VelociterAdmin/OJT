package com.velociter.generics;

public class TryParameterizedMethods {
	public static void main(String[] args) {
		BinaryTree<Person> people = new BinaryTree<Person>();
		
		//Create and add  some managers to the object
		Manager[] managers = { new Manager("Jane",1), new Manager("Joe",3),new Manager("Freda",3)};
		
		for(Manager manager: managers ) {
			people.add(manager);
		}
		
			Person[] persons = {new Person("Will"), new Person("Ann"), new Person("Mary"),new Person("Tina"), new Person("Stan")};
		for(Person person : persons) {
			people.add(person);
		}
		
		listAll(people.sort());
	}
	
		public static <T> void listAll(LinkedList<T> list) {
			for(T obj : list) {
				System.out.println(obj);
			}

	}
	
}
