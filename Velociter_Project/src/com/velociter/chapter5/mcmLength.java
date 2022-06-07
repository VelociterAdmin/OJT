package com.velociter.chapter5;

public class mcmLength{

	 public int millimeter;
	 public int centimeter;
	 public int meter;
	 
	 public mcmLength(int millimeter,int centimeter,int meter) 
	 {
		 this.millimeter=millimeter;
		 this.centimeter=centimeter;
		 this.meter=meter;
	 }
	
		 
	 public String toString() {
		return("millimeter:"+millimeter+" centimeter:"+centimeter+" meter:"+meter);
		
	 }
	 public double millimeterToCentimeter() {
		return centimeter=millimeter/10; 
	 }
	public int millimeterToMeter() {
		return meter=millimeter*1000;
	}
	public int centimeterToMillimeter() {
		return millimeter=centimeter/10;
	}
	public int centimeterToMeter(){
		return meter=centimeter/100;
	}
	public int meterToMillimeter(){
		return millimeter=meter*1000;
	}
	public int meterToCentimeter(){
		return centimeter=meter*100;
	}
	
	public static void main(String[]args) {
		mcmLength mcm=new mcmLength(0,100,2);
	    double d=mcm.meterToCentimeter();
	    System.out.println("Meter to Centimeter:\n"+d);
	    String s=mcm.toString();
	    System.out.println(s);
	    d=mcm.meterToMillimeter();
	    System.out.println("Meter to Millimeter:\n"+d);
	    s=mcm.toString();
	    System.out.println(s);
	   
	}
	}

	


