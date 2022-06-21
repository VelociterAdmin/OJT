package com.velociter.chapter6modified;

public class Rectangle extends Shape{
	double length=4;        //taking an double type variable length
	double width=5;          //taking an double type variable width
	double result=0;         //taking an double type variable result
	public double area() {     //override the method area
	result=length*width;      //formula of area of Rectangle
	System.out.println("area of Rectangle is:  "+result);  //printing the result
	return result;
	}

	
	public double perimeter() {      //override the method perimeter
		result=2*(length+width);    //formula of perimeter of Rectangle
		System.out.println("perimeter of Rectangle is:   "+result); //printing the result
		return result;
		
	}
	



}
