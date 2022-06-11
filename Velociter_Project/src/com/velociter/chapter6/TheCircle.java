package com.velociter.chapter6;

public class TheCircle {
	private static final String Center = null;
	double radius;
	
	public TheCircle(NewPoint center,double radius) {
		radius=radius;
	}
	public String toString() { 
			
	    return "Center "+ Center + " Radius " + radius;
	}
	  public void show() {					
	    System.out.println(" " +toString());

}
}