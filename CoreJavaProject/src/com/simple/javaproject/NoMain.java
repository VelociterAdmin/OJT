package com.simple.javaproject;

public class NoMain {
	static double pi = 3.1415;
	static{
		System.out.println("I am Without Main method");
	}
}
class TestNoMain{
	public static void main(String[] args) {
		System.out.println(NoMain.pi);
	}
}
