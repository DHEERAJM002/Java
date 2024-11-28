package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteUsingPrepared {
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
		System.out.println("Enter the id of the student whose record to be deleted");
		int id=sc.nextInt();
		String command="SELECT * FROM Student where id="+id;
		resultSet=statement.executeQuery(command);
		if(resultSet.next()) {
			String delete="Delete from Student where id=?";
			pst=con.prepareStatement(delete);
			pst.setInt(1, id);
			int res=pst.executeUpdate();
			//int returnData=statement.executeUpdate(delete);//insert,delete,update
			if(res>0)
				System.out.println(res+" records deleted");
			else
				System.out.println("Failed to delete a record");
		}
		else
			System.out.println("Id does not exist");
	}
}
