package com.velociter.definingclasses;

class Account{
	int a;
	int b;
	public void setData(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public void showData() {
		System.out.println("The value of a "+a);
		System.out.println("The value of b "+b);
	}
	
}

public class ThisVariable {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setData(2, 3);
		obj.showData();
	}

}
