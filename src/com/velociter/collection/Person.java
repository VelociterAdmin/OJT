package com.velociter.collection;

public class Person {
	public Person(String firstName,String surName) {
		this.firstName = firstName;
		this.surName = surName;
	}
	
	public String toString() {
		return firstName+ " " +surName;
		}
	
	private String firstName;
	private String surName;
}
