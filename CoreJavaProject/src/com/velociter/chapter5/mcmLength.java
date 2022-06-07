package com.velociter.chapter5;

public class mcmLength {

 public int millimeter;
 public int centimeter;
 public int meter;
 public mcmLength(int millimeter,int meter,int centimeter)
 {
	 this.millimeter=millimeter;
	 this.centimeter=centimeter;
     this.meter=meter;
 }
 public String toString() 
 {
	 return("millimeter:"+millimeter+" centimeter:"+centimeter+" meter:"+meter);
 }
 public int millimeterTocentimeter()
 {
	 return centimeter=millimeter/10;
 }
 public int milimeterTometer()
 {
	 return meter=millimeter/1000;
 }
 public int centemeterTomillimeter()
 {
	 return millimeter=centimeter/10;
 }
 public int centimeterTometer()
 {
	 return meter=centimeter/100;
 }
 public int meterTomillimeter()
 {
	 return millimeter=meter*1000;
 }
 public int meterTocentimeter()
 {
	 return centimeter=meter*100;
 }
 public static void main(String[]args) {
	 mcmLength length=new mcmLength(100,0,0);
	 double d=length.millimeterTocentimeter();
	 System.out.println("Milimeter To Centimeter Conversion:\n"+d);
	 String s=length.toString();
	 System.out.println(s);
		 
 } 
}
