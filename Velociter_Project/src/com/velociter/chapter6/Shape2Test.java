package com.velociter.chapter6;

public class Shape2Test {
public static void main(String[] args) {
	double k;
Shape2 s=new Shape2();
s.show();
k=s.areaOfRectangle(10, 20);
System.out.println(k);
k=s.areaOfSquare(40);
System.out.println(k);
k=s.radiusOfCircle(1);
System.out.println(k);
 }
}


