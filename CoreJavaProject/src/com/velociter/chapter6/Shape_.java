package com.velociter.chapter6;

import java.awt.Point;

public abstract class Shape_ {
	protected Point position;
	
	public void move(double xPosition,double yPosition) {
		position.x +=xPosition;
		position.y +=yPosition;
	}
	public abstract void show();

}
