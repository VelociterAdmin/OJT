package com.velociter.chapter13;

public class Person implements Comparable<Person>{
	protected String name;
	public Person(String name) {
		this.name=name;
	}

	@Override
	public int compareTo(Person person) {
		if(person == this) {
		return 0;
	}
		return this.name.compareTo(person.name);
	}
	public String toString() {
		return name;
		
	}

	}

