package com.velociter.chapter5example;

import com.velociter.chapter5example.Student.Student2;

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
		//Employee emp1=new Employee();
		Employee2 emp2=new Employee2();
		//System.out.println(emp1.empName);
		//System.out.println(emp1.empId);
		System.out.println(emp2.empAddress);
		System.out.println(emp2.empBranch);
		Student std1=new Student();
		Student.Student2 std2=std1.new Student2();
		//System.out.println(std1.name);
		//System.out.println(std1.id);
		
		System.out.println(std2.gender);
		System.out.println(std2.age);
	}
	}
