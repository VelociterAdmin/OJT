package com.simple.javaproject;

public class LogicalOperator {

	public static void main(String[] args) {
			char symbol= (char)(1);
			int i=0;
			while(i<64) {
			
			if(symbol>='A' && symbol <='Z') {
				System.out.println("You got a Capital Letter "+symbol+" "+ (int)symbol);
			}
			else if(symbol>='a' && symbol <='z') {
				System.out.println("You got a Small Letter   "+symbol+" "+ (int)symbol);
			}
			else
			{
				System.out.println("You got a symbol \t"+symbol+" "+ (int)symbol);
			}
			symbol = (char)(symbol+1);
			i++;
			}
	}

}
