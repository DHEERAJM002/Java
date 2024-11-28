package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertUsingPrepared {
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
		PreparedStatement pst=null;
		//System.out.println("Statement Object "+statement);
		System.out.println("Enter the id of the student whose record has to be inserted");
		int id=sc.nextInt();
		String command="SELECT * FROM Student where id="+id;
		resultSet=statement.executeQuery(command);
		if(!resultSet.next()) {
			String insert="Insert into STUDENT values(?,?,?,?);";
			pst=con.prepareStatement(insert);
			System.out.println("Enter the name of the student");
			sc.nextLine();
			String name=sc.nextLine();
			pst.setInt(1, id);
			pst.setString(2,name);
			System.out.println("Enter the date of birth of the student");
			String dob=sc.nextLine();
			pst.setString(3, dob);
			System.out.println("Enter the course id of the student");
			int cid=sc.nextInt();
			pst.setInt(4, cid);
			int res=pst.executeUpdate();
			//int returnData=statement.executeUpdate(delete);//insert,delete,update
			if(res>0)
				System.out.println(res+" records inserted");
			else
				System.out.println("Failed to insert a record");
		}
		else
			System.out.println("Id already exists");
	}
}
