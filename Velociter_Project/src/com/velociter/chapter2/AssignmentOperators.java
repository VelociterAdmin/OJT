package com.velociter.chapter2;

public class AssignmentOperators {
	

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		int c=50;
		int temp;
		
		temp = a;
		System.out.println(""+ temp);
        temp += a;
        System.out.println(""+ temp); 
        temp -= b;
        System.out.println(""+ temp);
        temp *= b;
        System.out.println(""+ temp);
        temp /= c;
        System.out.println(""+ temp);
        temp %= a;
        System.out.println(""+ temp);
	}

}
