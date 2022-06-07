package com.velociter.chapter2;

public class IncremnetDecrement {

	public static void main(String[] args) {
		int a=8;
		int b=8;
		int c=8;
		int d=8;
	//	a++;
    //	++b;
	//	c=a+c;
	//	d=b+d;
	//	System.out.println(c+" "+d);
		a=a+ ++b;
		System.out.println(b);
		System.out.println(a);
		c=c+ d++;
		System.out.println(d);
		System.out.println(c);
		byte y=123;
		System.out.println(y);
	}

}
