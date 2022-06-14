package com.velociter.chapter5example;

public class Student {
     static String name="Shweta";
     int id=17 ;
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Student.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public  void show1() {
		System.out.println("Name");
	}
	public  void show2() {
		System.out.println("Id");
	}
    
   public  class Student2 {
	   
	   public String gender = "Female";
	   protected int age=28;
		 
		
			 public  void show1() {
			 System.out.println("Gender");
		
	}
			 public void show2() {
			System.out.println("Age");
	

}
   }
}

         