package com.velociter.chapter3;

import java.util.Scanner;

public class DisplayRendomChoice {

	public static void main(String[] args) {
		System.out.println("Enter the number:");

		Scanner s=new Scanner(System.in);
		int i;
		i=s.nextInt();
		switch (i) {
		case 1:
		System.out.println("scrambled eggs");
		break;
		case 2:
	    System.out.println("waffles");
	    break;
		case 3:
		System.out.println("fruit");
		break;
		case 4:
		System.out.println("cereal");
		break;
		case 5:
	    System.out.println("toast");
	    break;
	    case 6:
		System.out.println("yogurt");
		break;
		default:	
		System.out.println("Wrong Choise");
		break;
		}

	}

}

