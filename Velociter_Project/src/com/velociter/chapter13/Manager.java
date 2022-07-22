package com.velociter.chapter13;

public class Manager extends Person{
	protected int level;

	public Manager(String name,int level) {
		super(name);
	 this.level=level;
	}
	public String toString() {
		return " Manager "+ super.toString() + " level: "+ level;
		}
	
	
		}