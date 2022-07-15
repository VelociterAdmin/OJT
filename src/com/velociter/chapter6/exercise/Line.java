package com.velociter.chapter6.exercise;

public class Line extends Shape {
	private Point end;
	
	public Line(Point start,Point End) {
		// TODO Auto-generated constructor stub
		position = new Point(start);
		this.end = new Point(end.x-start.x, end.y - start.y);
	}
	
	//String Representation
	public String toString() {
		return "Line :"+position+" to "+position.add(end);
	}
	
	//Override Show()
	public void show() {
		
	}
}
