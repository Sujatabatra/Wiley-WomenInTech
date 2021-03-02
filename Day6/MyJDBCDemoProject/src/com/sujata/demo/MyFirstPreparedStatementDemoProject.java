package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyFirstPreparedStatementDemoProject {

	public static void main(String[] args) {
		Connection connection=null;
		Scanner sc=new Scanner(System.in);
		try{
			//1 Connect
			//1.1 Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");  //throwing checked Exception ClassNotFound
			//1.2 Connect to the Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");  //throwing check exception SQLException
		
			//2. Query
//			Statement statement=connection.createStatement();
			
			PreparedStatement statement=connection.prepareStatement("INSERT INTO LOCATIONS VALUES(?,?,?,?,?,?)");
			
			System.out.println("Enter Location ID :");
			int id=sc.nextInt();
			System.out.println("Enter Street Address : ");
			String addr=sc.next();
			System.out.println("Enter Postal code : ");
			String pc=sc.next();
			System.out.println("Enter City : ");
			String city=sc.next();
			System.out.println("Enter State : ");
			String state=sc.next();
			System.out.println("Enter Country ID : ");
			String ci=sc.next();
			
			statement.setInt(1, id);
			statement.setString(2, addr);
			statement.setString(3, pc);
			statement.setString(4, city);
			statement.setString(5, state);
			statement.setString(6, ci);
			
//			String query="Insert into locations values("+id+",'"+addr+"','"+pc+"','"+city+"','"+state+"','"+ci+"')";

			int rows=statement.executeUpdate();  //for DML Operation we have executeUpdate
			//3.Process Results
			if(rows>0)
				System.out.println("Record Inserted");
			else
				System.out.println("Record Not Inserted");
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
