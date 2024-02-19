package com.capgemini.pradeepAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	
	public Connection getConnection() throws ClassNotFoundException,SQLException {
		
		
// Connect to Database.
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/JDBC_Assignment","root","Pradeep@2002");
		System.out.println("Connection Established");
		


		return con;
	}

}
