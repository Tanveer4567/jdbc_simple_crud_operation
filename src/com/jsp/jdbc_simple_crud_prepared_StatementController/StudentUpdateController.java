package com.jsp.jdbc_simple_crud_prepared_StatementController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdateController {
	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc-preparedstatment";
			String user = "root";
			String pass = "root";
			
			
			
			connection=DriverManager.getConnection(url, user, pass);
			
			
			Statement statement=connection.createStatement();
String updateStudentQuery = "update student set name='Raman' WHERE id=123";
			
			int id=statement.executeUpdate(updateStudentQuery);
			
			if(id==1) {
				System.out.println("Data---Updated----");
			}else {
				System.out.println("Data---is not---Updated--check your id--");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
