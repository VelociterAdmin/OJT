package com.velociter.chapter3;

public class RandomSequenceOfCapitalLetters {

	public static void main(String[] args) {
		char charactor = 'A';
		for(int i=1;i<=26;i++) {
			charactor = (char) (charactor + (26*Math.random()));
			switch(charactor) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				break;
			default:
				System.out.println(charactor);
			}
		}
	}

}
