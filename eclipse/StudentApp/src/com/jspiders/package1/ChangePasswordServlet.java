package com.jspiders.package1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class ChangePasswordServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException,IOException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();


		//Get the Form Data
		String regno=req.getParameter("regno");
		String CurrentPassword=req.getParameter("CurrentPassword");
		String NewPassword=req.getParameter("NewPassword");
		String RetypeNewPassword=req.getParameter("RetypeNewPassword");

		if(NewPassword.equals(RetypeNewPassword))
		{
			Connection con=null;
			ResultSet rs=null;
			PreparedStatement pstmt=null;
			try
			{
				Driver driverRef=new Driver ();
				DriverManager.registerDriver(driverRef);

				String dburl="jdbc:mysql://localhost:3306/bece8_db?username=root&password=root";
				con=DriverManager.getConnection(dburl);

				String query ="update students_otherinfo set password=? where regno=? and password=?";
				pstmt=con.prepareStatement(query);
				pstmt.setString(1,NewPassword);
				pstmt.setInt(2,Integer.parseInt(regno));
				pstmt.setString(3,CurrentPassword);

				int count = pstmt.executeUpdate();

				if(count>0)
				{
					out.println("you have successfully changed password");
				}
				else
				{
					out.println("unable to changed password");
				}
			}
			catch(Exception e)
			{
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
}