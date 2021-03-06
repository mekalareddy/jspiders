package com.jspiders.Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Driver;

public class Assignment4 
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try
		{
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);

			String dburl="jdbc:mysql://localhost:3306/bece8_db?user=root&password=root";
			con = DriverManager.getConnection(dburl);

			String query = "insert into guardian_info "+" values(?,?,?,?)";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setString(3,args[2]);
			pstmt.setString(4,args[3]);
			int count=pstmt.executeUpdate();

			System.out.println("created profile");
		}	
		catch(SQLException e)
		{	
			System.err.println("unable to create profile");
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(con!=null)
				{
					con.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}
}
