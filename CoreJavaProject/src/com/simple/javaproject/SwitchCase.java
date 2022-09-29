package com.simple.javaproject;

public class SwitchCase {
	enum WashChoise {cotten ,linen ,wool ,synthetic}
	public static void main(String[] args) {
		WashChoise wash = WashChoise.cotten;
		int cloth=(int)(6*Math.random());
		System.out.println(cloth);
		switch(cloth) {
			case 1:
				System.out.println("Washing shirt.");
				wash = WashChoise.cotten;
				break;
			case 2:
				System.out.println("Washing sweater.");
				wash = WashChoise.wool;
				break;
			case 3:
				System.out.println("Washing socks.");
				wash = WashChoise.wool;
				break;
			case 4:
				System.out.println("Washing sheets.");
				wash =  WashChoise.linen;
				break;
			case 5:
				System.out.println("Washing pants.");
				wash = WashChoise.synthetic;
				break;
			default:
				System.out.println("Unknown Washing - default Synthetic.");
				wash = WashChoise.synthetic;
				break;
		}
		System.out.println("Wash is "+wash);
		switch(wash) {
		case wool:
			System.out.print("The Temprature is 120");
			break;
		case cotten:
			System.out.print("The Temprature is 170");
			break;
		case synthetic:
			System.out.print("The Temprature is 130");
			break;
		case linen:
			System.out.print("The Temprature is 180");
			break;
		
		}

	}

}
