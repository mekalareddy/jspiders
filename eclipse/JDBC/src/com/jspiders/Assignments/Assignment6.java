package com.jspiders.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jspiders.java.Main;

import com.mysql.jdbc.Driver;

public class Assignment6 
{
	static Connection con=null;
	static Statement stmt=null;
	static ResultSet rs=null;
	public static void main(String[] args) 
	{
		try 
		{
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);

			String dburl="jdbc:mysql://localhost:3306/bece8_db?user=root&password=root";
			con=DriverManager.getConnection(dburl);

			String Query="Select * from guardian_info";
			stmt=con.createStatement();
			rs=stmt.executeQuery(Query);




		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}		


	}
}
