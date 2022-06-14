package com.velociters.experiment;
public class EmployeeClone {
	int emps[]=new int[250000];
	public static void main(String[] args) {
		System.out.println("IDs of Accenture Employees");
		int emps=((int) Math.random()*250000);
		System.out.println(emps);
		
		Employee emp=new Employee();
		for(int i=0;i<=10;i++) {
			int temp=emp.emps[i];
			System.out.println(temp);
			
	 }
	}

}
