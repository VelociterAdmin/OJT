package com.velociter.chapter6modifiedquestions;

public class Triangle extends Shape2{
	double base;
	double height;
	double side;
	double result;

	public Triangle(double base,double height,double side) {
      this.base=base;
      this.height=height;
      this.side=side;
	}

	@Override
	public double area() {
	System.out.print("A triangle whose base    = "+base);
	System.out.print(" ; height = "+height);
	result=(base*height/2);
	System.out.println(" ;   Area of triangle       = "+result);
	
		return 0;
	}

	@Override
	public double perimeter() {
		System.out.print("A triangle whose base    = "+base);
		System.out.print(" ; height = "+ height);
		System.out.print(" ;   sideC = "+side);
		result=(base + height + side);
		System.out.println(" ;  Perimeter of triangle = "+result);
	    return 0;
	}
	

}
