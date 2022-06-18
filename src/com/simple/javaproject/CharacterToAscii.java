package com.simple.javaproject;

public class CharacterToAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		char symbol = 'A'; 
		while(i<128) {
			//symbol  = (char) (symbol+1);
			if(symbol >='A') {
				if(symbol <='Z') {
					System.out.println("The Symbol is "+symbol+" The Ascii is "+(int) symbol);
				}
				else {
					if(symbol>='a') {
						if(symbol<='z') {
							System.out.println("The Symbol is "+symbol+" The Ascii is "+(int) symbol);
						}
					}
					else {
						System.out.println("The Symbol is "+symbol+" The Ascii is "+(int) symbol);
						
					}
				}
				
			}
			else {
				System.out.println("The Symbol is "+symbol+" The Ascii is "+(int) symbol);
				
			}
			
			symbol  = (char) (symbol+1);
			i++;
		}

	}

}
