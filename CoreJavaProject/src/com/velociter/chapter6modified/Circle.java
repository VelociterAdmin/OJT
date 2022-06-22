package com.velociter.chapter6modified;

public class Circle extends Shape{
	int radius = 0;
	double result;
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
		result=(Math.PI)*radius*radius;
		System.out.println("Area of Circle is "+result+"    whose radius is "+radius);
		return 0;
	}

	@Override
	public double perimeter() {
		result= 2*(Math.PI)*radius;
		System.out.println("Perimeter of Circle is "+result+"    whose radius is "+radius);
		return 0;
	}
	
	

}
