package com.velociter.arraysstrings;

public class SortingString {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String text = "You should now be thoroughly familiar with how to create and use arrays. Most people have little trouble dealing with one-dimensional arrays, but arrays of arrays are a bit trickier so try to practice using these.";
		int spaces = 0, vowels = 0, letters=0;
		int textLength = text.length();
//		for(int i=0; i<textLength; i++) {
//			char ch = text.charAt(i);
//			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
//				vowels++;
//			}
//			if(ch == ' ') {
//				spaces++;
//			}
//				
//		}
//		System.out.println(spaces);
		char[] textArray = text.toCharArray();
		for(int i=0;i<textArray.length;i++) {
			System.out.println(textArray[i]);
		}
	}
}
