package com.simple.javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
//		PreparedStatement ps = con.prepareStatement("select * from employees");
//		ResultSet rs = ps.executeQuery();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employees");
		System.out.print("Name  |  Salary  |  Location\n");
		while(rs.next()) {
			
			System.out.print(rs.getString(1)+"  |  "+rs.getInt(2)+"  |  "+rs.getString(3));
		}
		con.close();
	}catch(Exception e)
		{
		System.out.print(e);
		}
	}
	

}
