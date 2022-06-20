package com.velociter.chapter3;

public class VowelsWithArray {

	public static void main(String[] args) {
		char[] vowels = {'A','E','I','O','U'};
		char[] chars = new char[26];
		int j=0;
		for(int i=0;i<chars.length;i++) {
			chars[i]=(char) (i+65);
			//System.out.println(chars[i]);
		}
		for(int i=0;i<chars.length;i++,j++) {
			if(vowels[j]==chars[i]) {
				System.out.println(chars[i]);	
			}
			
			
			
			
//			switch(chars[i]) {
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//				continue;
//			}
			
	}

}
	
}