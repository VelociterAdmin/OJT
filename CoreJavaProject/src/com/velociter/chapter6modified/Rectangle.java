package com.velociter.chapter6modified;

public class Rectangle extends Shape{
	double length ;
	double width ;
	double result;
	public Rectangle() {}
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	public double area() {     //override the method area
		result=length*width;
	System.out.println("area of Rectangle  "+result+"  whose length is   "+length+"  and width is "+width);
	return 0;     //formula of area of Rectangle
	
	}

	
	public double perimeter() {      //override the method perimeter
		result=2*(length+width);
		System.out.println("perimeter of Rectangle "+result+  "  whose length is  "+length+"  and width is "+width);
		return 0;   //formula of perimeter of Rectangle
		
	}


}
