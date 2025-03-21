package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.eclipse.jdt.internal.compiler.apt.dispatch.RoundDispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;


@jakarta.servlet.annotation.WebServlet("/Register")
public class Register extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequestWrapper request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("fname");
		String uname = request.getParameter("user");
		String pass = request.getParameter("pwd");
		
		String url = "jdbc:mysql://localhost:3306/mphintern";
		String userName = "root";
		String password = "password";
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,userName,password);
			
			String sql = "insert into user_mla (mla_fname, mla_user, mla_pass)values(?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, name);
			pst.setString(2, uname);
			pst.setString(3, pass);
			
			int x = pst.executeUpdate();
			
			if(x > 0)
			{
				RequestDispatcher rd = request.getRequestDispatcher("home.html");
				
				rd.forward(request, response);
			}
			else
			{
				out.println("<center> <h3><font color = 'red'> Registration failed.</font> </h3></center>");
				
				RequestDispatcher rd = request.getRequestDispatcher("register.html");
				
				rd.include(request, response);
			}
			
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
