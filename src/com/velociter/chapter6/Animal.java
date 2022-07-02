package com.velociter.chapter6;

public abstract class Animal {

	public abstract void sound();
	
	public Animal(String aType) {
		type = new String(aType);
	}
	public String toString() {
		return "This is a "+ type;
	}
	

	
	private String type;

}
