package com.velociter.chapter6modifiedquestions;

public class TestShape {

	public static void main(String[] args) {
		
		Rectangle rc=new Rectangle();
		System.out.println("Area of Rectangle:"+rc.area());
        System.out.println("Perimeter of Rectangle:"+rc.perimeter());
        
        Circle circle=new Circle();
        System.out.println("Area of Circle:"+circle.area());
        System.out.println("Perimeter of Circle:"+circle.perimeter());
	}

}
