package com.velociter.chapter5;

import java.awt.Point;

public class Rectangle {
	  private double x;
	  private double y;
	
	  public void Point(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }
	 
	 
	  public void Point(Point p) {
	    x = p.x;
	    y = p.y;
	  }
	 
	
	    double getX() {
	    return x;
	  }
	 
	
	  double getY() {
	    return y;
	  }
	 
	  public String toString(){
	    return x +","+y;
	  }
	 
 }
 
