package com.jsp.jdbc_simple_crud_prepared_StatementController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsertController {
	
	public static void main(String[] args) {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//step-2 create connection
			String url = "jdbc:mysql://localhost:3306/jdbc-preparedstatment";
			String user = "root";
			String pass = "root";
			
			connection=DriverManager.getConnection(url, user, pass);
					
			//step-3 create statement
			Statement statement=connection.createStatement();
			
			//step-4 execute Query
			String insertStudentQuery = "insert into student(id,name,email,phoneno)"
					+ "values(123,'tanveer','yahoo@',65758585)";
			statement.execute(insertStudentQuery);
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
