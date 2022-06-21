package com.velociter.chapter6modifiedquestions;

public class Rectangle extends Shape2{
	//declared length and initialize it.
	double length=5;
	//declare width and initialize it.
	double width=10;

//override the common methods from extended class shape2. 	
	public double area() {
		return length*width;
	}

	public double perimeter() {
		return (2*(length+width));
	}

}
