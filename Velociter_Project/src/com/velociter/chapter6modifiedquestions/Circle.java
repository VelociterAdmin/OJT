package com.velociter.chapter6modifiedquestions;

public class Circle extends Shape2 {
	double radius;
	double result;
	
	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	public double area() {
	System.out.print("A Circle whose radius :"+radius);
	result = Math.PI*radius*radius;
    System.out.println(" calculate the Area of circle: "+result);
	return 0;
	}
	@Override
	public double perimeter() {
	System.out.print("A Circle whose radius :"+radius);
	result = 2*Math.PI*radius;
	System.out.print(" calculate the perimeter of circle: "+result);
	return 0;
	}

	

	
}
