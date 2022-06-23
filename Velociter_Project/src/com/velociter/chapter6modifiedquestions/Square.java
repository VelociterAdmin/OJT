package com.velociter.chapter6modifiedquestions;

public class Square extends Shape2{
	double side;
	double result;

	public Square(double side) {
		this.side=side;
		
	}
	@Override
	public double area() {
		System.out.print("A square whose side      = "+ side);
		result=side*side;
		System.out.println(" ;  Area of square      = "+result);
		return 0;
	}

	@Override
	public double perimeter() {
		System.out.print("A square whose side      = "+ side);
		result=4*side;
		System.out.println(" ;  Perimeter of square = "+result);
		return 0;
	}
	

}
