package com.velociter.chapter2;

public class Tax {

	public static void main(String[] args) {
		float f1,f2,c;
		int taxD,taxC;
        f1=(float)231.00;
        f1=(float)((35*f1)/100);
        c=(float)(f1*100);
        taxD=(int)c;
        taxC=(int)((c-taxD)*100);
        System.out.println("tax rate in dollar "+f1);
        System.out.println("tax rate in cents "+c);
	}

}
