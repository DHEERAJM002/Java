package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {
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
		System.out.println("Enter the id of the Employee to be inserted");
		int id=sc.nextInt();
		String command="SELECT * FROM Employee where Emp_Id="+id;
		resultSet=statement.executeQuery(command);
		if(!resultSet.next()) {
			System.out.println("Enter the name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter the date of birth in YYYY-MM-DD format");
			String dob=sc.nextLine();
			System.out.println("Enter the salary");
			float salary=sc.nextFloat();
			System.out.println("Enter the email id");
			sc.nextLine();
			String email=sc.nextLine();
			System.out.println("Enter the phone number");
			String phone=sc.nextLine();
			System.out.println("Enter the hobby");
			String hobby=sc.nextLine();
			String insert="INSERT INTO EMPLOYEE VALUES("+id+",'"+name+"','"+dob+"',"+salary+",'"+email+"','"+phone+"','"+hobby+"');";
			int returnData=statement.executeUpdate(insert);//insert,delete,update
			if(returnData>0)
				System.out.println(returnData+" record inserted");
			else
				System.out.println("Failed to delete a record");
		}
		else
			System.out.println("Id already exits.");
	}
}
