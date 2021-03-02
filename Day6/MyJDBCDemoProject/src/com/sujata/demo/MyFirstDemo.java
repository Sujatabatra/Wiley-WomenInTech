package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstDemo {

	public static void main(String[] args) {
		Connection connection=null;
		try{
			//1 Connect
			//1.1 Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");  //throwing checked Exception ClassNotFound
			//1.2 Connect to the Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");  //throwing check exception SQLException
		
			//2. Query
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery("SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL FROM EMPLOYEES"); //executeQuery for all DQL statement

			//3.Process Results
			while(resultSet.next())//throwing check exception SQLException
			{
				int id=resultSet.getInt("EMPLOYEE_ID");//throwing check exception SQLException
				String fname=resultSet.getString("FIRST_NAME");//throwing check exception SQLException
				String lname=resultSet.getString("LAST_NAME");//throwing check exception SQLException
				String email=resultSet.getString("EMAIL");//throwing check exception SQLException
				System.out.println(id+" "+fname+" "+lname+" "+email);
			}
		}
		catch(ClassNotFoundException|SQLException ex){
			ex.printStackTrace();
		}
		finally{
			try {
				//4. Close Connection
				connection.close();   //throwing check exception SQLException
			} catch (SQLException e) {
				e.printStackTrace();
			}  
		}
	}

}
