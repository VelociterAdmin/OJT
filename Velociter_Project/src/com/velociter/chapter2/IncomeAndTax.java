package com.velociter.chapter2;

public class IncomeAndTax {

	public static void main(String[] args) {
		 float f1,f2,c;
		 int taxDollar,taxCents;
		 f1=(float)231.00;
		 f1=(float)((35*f1)/100);
		 System.out.println(""+f1);
		 c=(float)(f1*100);
		 taxDollar=(int)c;
		 taxCents=(int)((c-taxDollar)*100);
		 System.out.println("income in Dollars="+f1);
		 System.out.println(" Rate in cents="+c);
		
	}

}
