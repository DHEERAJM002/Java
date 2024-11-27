package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecordById {
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
		System.out.println("Enter the id of the Employee whose phone number has to be updated");
		int id=sc.nextInt();
		String command="SELECT * FROM Employee where Emp_Id="+id;
		resultSet=statement.executeQuery(command);
		if(resultSet.next()) {
			System.out.println("Enter the new phone number");
			String ph=sc.next();
			String update="UPDATE EMPLOYEE SET phone='"+ph+"'where Emp_Id="+id;
			int returnData=statement.executeUpdate(update);//insert,delete,update
			if(returnData>0)
				System.out.println(returnData+" record updated");
			else
				System.out.println("Failed to update a record");
		}
		else
			System.out.println("Id does not exist");
	}
}
