package com.velociter.chapter6modifiedquestions;

public class Rectangle extends Shape2{
	double length;
	double width;
	double result;
	
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
		
	}
//override the common methods from extended class shape2. 	
	public double area() {
	System.out.print("A rectangle whose length :"+length);
	System.out.print(" and width :"+ width );
       result=length*width;
       System.out.println("calculate the Area of rectangle "+result);
		return 0;
	}

	public double perimeter() {
		System.out.print("A rectangle whose length :"+length);
		System.out.print(" and width :"+ width );
	      result=(2*(length+width));
	      System.out.println(" calculate the perimeter of rectangle "+result);
		 return 0;
	}
	

	
}
