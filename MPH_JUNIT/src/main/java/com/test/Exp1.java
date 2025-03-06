package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Exp1 {
	public static void main(String[] args) throws Exception
	{
		String driverClass="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/MphTraining";
		String username="root";
		String password="root@39";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, username, password);
			
			Statement stmt =con.createStatement();
			
			String sql1="insert into student values(10, 'akki','akki@gmail.com')";
			String sql2="insert into student values(11, 'rohith','rohith@gmail.com')";
			String sql3="insert into student values(12, 'bunny','bunny@gmail.com')";
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			
			String sql11="insert into student values(?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(sql1);
			
			pst.setInt(1, 90);
			pst.setString(2,  "axar");
			pst.setString(3,  "axar@gmail.com");
			
			pst.addBatch();
	
			pst.executeBatch();
			
			String sql211="insert into student values(?,?,?)";
			
			PreparedStatement pst2=con.prepareStatement(sql211);
			
			pst.setInt(1, 91);
			pst2.setString(2,  "kuldeep");
			pst2.setString(3, "kuldeep@gmail.com");
			
			pst2.addBatch();
			//batch process is a group of queries
			
			pst2.executeBatch();
		}
			
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
