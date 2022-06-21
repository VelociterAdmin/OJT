package com.velociter.chapter6modifiedquestions;

public class Circle extends Shape2 {
	double radius=5;

	@Override
	public double area() {
		
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		
		return 2*Math.PI*radius;
	}

	
}
