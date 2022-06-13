package com.velociters.experiment;

public class Employee {
	int emps[]= {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010};
	
	
	public void showEmpId()
	{
      System.out.println("the Id's of employees are");
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		for(int i=0;i<=10;i++) {
			int temp=emp.emps[i];
			System.out.println(temp);
			
	 }
	}

}
