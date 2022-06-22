package com.velociter.chapter6modifiedquestions;

public class TestShape {

	public static void main(String[] args) {
	
		Rectangle rectangle=new Rectangle(5, 10);
		rectangle.area();
		rectangle.perimeter();
		Circle circle=new Circle(3);
		circle.area();
		circle.perimeter();
	}

}
