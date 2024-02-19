package com.capgemini.pradeepAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question_1 {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		
// Connect to Database.
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JDBC_Assignment","root","Pradeep@2002");
		System.out.println("Connection Established");
		
		
		String executingQuery = "SELECT * FROM emp";
		
		Statement st = con.createStatement();
		
		ResultSet rt = st.executeQuery(executingQuery);
		
		while(rt.next()) {
			int empno = rt.getInt(1);
			String ename = rt.getString("ename");
			System.out.println("The empno is : " + empno + " And name is : "+ ename);
		}
		rt.close();
		st.close();
		con.close();
		
		
		
		

	
	}

}
