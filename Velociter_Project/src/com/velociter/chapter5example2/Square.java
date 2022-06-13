package com.velociter.chapter5example2;
import com.velociter.chapter5example.*;

public class Square extends Shape {
	
	public int getAreaOfSquare(int s) {
		return s * s;
	}
	public static void main(String[] args) {
		Square sq=new Square();
		System.out.println(sq.getArea(4,4));
		System.out.println(sq.getAreaOfSquare(3));
	}

	
	}


