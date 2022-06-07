package com.velociter.chapter2;
import java.util.Scanner;
import java.io.IOException;
public class Hello {

	public static void main(String[] args) {
		System.out.println("hello");
	    long a=12345678901l;
		System.out.print(a);
		Scanner S=new Scanner(System.in);
		a=S.nextLong();
		System.out.println(a+8);
		System.out.println("hi");
		System.out.print("(press e to exit)");
		try {
		System.in.read();
		}
		catch(IOException e){
		
		}
		int b=6,c=2;
		double d=b/c;
		System.out.println(d);
	}

}
