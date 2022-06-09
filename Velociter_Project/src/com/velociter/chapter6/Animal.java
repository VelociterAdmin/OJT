package com.velociter.chapter6;

public class Animal {
	private String type;
	
	public Animal(String aType) {
	type = new String(aType);
	}
	
	public String toString() {
	return "This is a:"+type;
	}

}
