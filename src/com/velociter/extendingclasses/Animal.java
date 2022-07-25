package com.velociter.extendingclasses;

public abstract class Animal implements Cloneable {

	public abstract void sound();
	
	public Animal(String aType) {
		type = new String(aType);
	}
	public String toString() {
		return "This is a "+ type;
	}
	

	
	private String type;

}
