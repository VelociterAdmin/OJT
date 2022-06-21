package com.velociter.chapter3;

import java.util.Scanner;

public class ConfirmPasswordChecking {

	public static void main(String[] args) {
		String password =null,confirmPassword = null;
		String obj = new String();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Password :");
//		password = scan.next();
		password = "Sh";
		System.out.println("Enter Password Again:");
//		confirmPassword = scan.next();
		confirmPassword = "Sh";
		confirmPassword = confirmPassword.intern();
		System.out.println(password +" : "+confirmPassword);
		password = confirmPassword;
		if(password == confirmPassword) {
			System.out.println("Password Matched");
		}
		else {
			System.out.println("Password DoNot Match");
		}

	}

}
