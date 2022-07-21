package com.velociter.generics;

public class ForLoop {
	public static void main(String[] args) {
		String[] warehouses = {"Indore","Dehli","Mumbai","Hydrabad"};
		System.out.println("Foreach\n");
		for(String warehouse : warehouses) {
			System.out.println(warehouse);
		}
		System.out.println("\nfor\n");
		for(int i=0; i<warehouses.length; i++) {
			System.out.println(warehouses[i]);
		}
		System.out.println(warehouses.length);
	}
}