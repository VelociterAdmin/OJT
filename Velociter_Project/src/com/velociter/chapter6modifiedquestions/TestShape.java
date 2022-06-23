package com.velociter.chapter6modifiedquestions;

public class TestShape {

	public static void main(String[] args) {
	
		Rectangle rectangle=new Rectangle(5, 10);
		rectangle.area();
		rectangle.perimeter();
		Triangle triangle = new Triangle(12,3,5);
		triangle.area();
		triangle.perimeter();
		Circle circle=new Circle(3);
		circle.area();
		circle.perimeter();
		Square square=new Square(5);
		square.area();
		square.perimeter();
		
		
	}

}
