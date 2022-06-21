package com.velociter.chapter6modified;

public class Square extends Shape{
	double side=10;     //taking an double type variable side 
	double result=0;     //taking an double type variable result
	
	public double area() {     //override the method area
		result=side*side;
		System.out.println("area of Square is:   "+result); //printing the result
		return result;
		
	}

	
	public double perimeter() {     //override the method perimeter 
		result=4*side;
		System.out.println("perimeter of Squre is:  "+result); //printing the result
		return result;
		
	}

}
