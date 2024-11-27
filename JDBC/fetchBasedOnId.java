package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class fetchBasedOnId {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/Classes";
		String userName="root";
		String password="Sanmagree@02";
		Connection con=null;
		Statement statement=null;
		ResultSet resultSet=null;
		//load the driver
		Class.forName(driver);
		//make connection
		con=DriverManager.getConnection(url, userName, password);
		//System.out.println("Coonection Object "+con);
		statement=con.createStatement();
		//System.out.println("Statement Object "+statement);
		System.out.println("Enter the id of the Employee whose record to be fetched");
		int id=sc.nextInt();
		String command="SELECT * FROM Employee where Emp_Id="+id;
		resultSet=statement.executeQuery(command);
		if(resultSet.next()) {
			System.out.println("ID\t: "+resultSet.getInt(1));
			System.out.println("Name\t: "+resultSet.getString(2));
			System.out.println("Date Of Birth: "+resultSet.getString(3));
			System.out.println("Salary\t: "+resultSet.getFloat(4));
			System.out.println("Email Id: "+resultSet.getString(5));
			System.out.println("Phone\t: "+resultSet.getString(6));
			System.out.println("Hobby\t: "+resultSet.getString(7));
		}
		else
			System.out.println("Id does not exist");
	}
}
