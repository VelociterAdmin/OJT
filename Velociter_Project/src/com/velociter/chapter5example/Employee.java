package com.velociter.chapter5example;


public  class Employee  {
	public  String empName="Danish";
	public  int empId=16;
	
	public  void show() {
		System.out.println("empName");
	}
	public void show2() {
		System.out.println("empId");
	}
	
	public static class Employee2 extends Student{
		 static String empAddress="Indore";
		 static String empBranch="Development";
		
		public static void show3() {
			System.out.println(empAddress);
			
		}
		public static void show4() {
			System.out.println(empBranch);
		}
	}

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee2 emp2=new Employee2();
		Student std1=new Student();
		System.out.println(std1.getName());
		System.out.println(std1.getId());
	}
	}
