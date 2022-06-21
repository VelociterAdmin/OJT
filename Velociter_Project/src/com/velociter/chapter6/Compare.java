package com.velociter.chapter6;

public class Compare extends Equal_Method{
	
	public Compare(int list1,int list2) {
		if(list1==list2) {
			System.out.println("equal");
		}
		else {
			System.out.println("not");
		}
		
	}
	public static void main(String[] args) {
		Compare com=new Compare(1,2);
		System.out.println(com);
	}

}
