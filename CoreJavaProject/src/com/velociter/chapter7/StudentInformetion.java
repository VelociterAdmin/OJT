package com.velociter.chapter7;

public class StudentInformetion {
    private  int studentID[]= {1001,1002,1003,1004};
	public  String studentNames[]= {"danish","shweta","dev","shafiq"};
	public int studentAges[]=null;
	
	public void showNames()
	{
		System.out.println("names of students");
		for(int i=0;i<=3;i++) {
			System.out.println(studentNames[i]);
		}
		System.out.println("length of rollnumbers of students names");
		try {
			int rollNumber[]=new int[-4];
			System.out.println(rollNumber.length);
		}
		catch(NegativeArraySizeException e) {
          System.out.println("it is an NegativeArraySizeException");
          System.out.println(e.getStackTrace());
		}
	}
		public void showID() {
			System.out.println("ids of students");
			try {
                for(int j=0;j<=10;j++) {
                	System.out.println(studentID[j]);}
                }
                catch(IndexOutOfBoundsException e)
                {
                	System.out.println("it is an IndexOutOfBoundsException");
                	System.out.println(e.getStackTrace());
                }
			}
		public void showAges()
		{
			try {
				System.out.println(studentAges.length);
			}
			catch(NullPointerException e) {
				System.out.println("it is a NullPointerException");
				System.out.println(e.getStackTrace());
			}
		}
		public static void main(String[] args) {
			StudentInformetion info=new StudentInformetion();
			info.showNames();
			info.showID();
			info.showAges();
		}
			
   }
 

