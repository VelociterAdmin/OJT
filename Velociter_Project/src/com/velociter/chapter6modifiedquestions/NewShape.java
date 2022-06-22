package com.velociter.chapter6modifiedquestions;

public abstract class NewShape {
	
	protected double xposition;
	protected double yposition;
	
 public void move(double xposition,double yposition) {
		 xposition +=xposition;
		 yposition +=yposition;
		  
		   }

	  public abstract void show();	
	}


