package com.velociter.chapter8;

import java.io.IOException;

public class Test_FormattedInput {
	public static void main(String[] args) throws IOException {
		FormattedInputExample formate = new FormattedInputExample();
		for (int i = 0; i < 5; i++) {
			try {
			System.out.print("Enter an integer: ");
			System.out.println("Integer read:"+formate.readInt());
			System.out.print("Enter a double value: ");
			System.out.println("Double value read:"+ formate.readDouble());
			System.out.print("Enter a string: ");
			System.out.println("String read:" + formate.readString());
			} catch (InvalidUserInputException e) {
			System.out.println("InvalidUserInputException"+e.getMessage());
			
	}

}
}
}