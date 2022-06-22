package com.velociter.chapter6modified;

public class Square extends Shape{   
	double side;
	double result;
	public Square(double side) {
		this.side=side;
	}
	public double area( ) {     //override the method area
		result=side*side;
		System.out.println("Area of Square is "+result+"  whose side is  "+side);
		return 0;
		
	}

	
	public double perimeter( ) {     //override the method perimeter 
		result=4*side;
		System.out.println("Perimeter of Square is "+result+"  whose side is  "+side);
        return 0;

	}

}
