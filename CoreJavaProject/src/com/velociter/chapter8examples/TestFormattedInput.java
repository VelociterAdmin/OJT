package com.velociter.chapter8examples;

public class TestFormattedInput {

	public static void main(String[] args) {
		FormattedInput kb = new FormattedInput();
		for (int i = 0; i < 5; i++) {
		try {
		System.out.print("Enter an integer: ");
		System.out.println("Integer read: " + kb.readInt());
		System.out.print("Enter a double value: ");
		System.out.println("Double value read: " + kb.readDouble());
		System.out.print("Enter a string: ");
		System.out.println("String read: " + kb.readString());
		} catch (InvalidUserInputException e) {
		System.out.println("InvalidUserInputException thrown.\n");
	}
  }
 }
}