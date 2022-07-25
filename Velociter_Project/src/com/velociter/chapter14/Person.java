package com.velociter.chapter14;

public class Person {
	private String firstName;  // First name of person
	private String surname;    // Second name of person
	// Constructor
	public Person(String firstName, String surname) {
	this.firstName = firstName;
	this.surname = surname;
	}
	public String toString() {
	return firstName + " " + surname;
	}
	
	}

