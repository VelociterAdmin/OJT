package com.velociter.chapter2;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("lets Go");
		Scanner s=new Scanner(System.in);
		int dan;
		dan=s.nextInt();
		switch (dan) {
		case 1:
		System.out.println("danish");
		break;
		case 2:
	    System.out.println("shoaib");
	    break;
		case 3:
		System.out.println("rizwan");
		break;
		default:
		System.out.println("Wrong Choise");
		break;
		
		}

	}

}
