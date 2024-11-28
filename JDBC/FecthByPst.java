package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FecthByPst {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/Classes";
		String userName="root";
		String password="Sanmagree@02";
		Connection con=null;
		Statement statement=null;
		//ResultSet resultSet=null;
		//load the driver
		Class.forName(driver);
		//make connection
		con=DriverManager.getConnection(url, userName, password);
		//System.out.println("Coonection Object "+con);
		statement=con.createStatement();
		PreparedStatement pst=null;
		//System.out.println("Statement Object "+statement);
		pst=con.prepareStatement("Select * from student");
		ResultSet resultSet=pst.executeQuery();
		System.out.printf("%-10s%-10s%25s%15s\n","ID","Name","Date of Birth","Course Id");
		while(resultSet.next()) {
			int id=resultSet.getInt("id");
			String name=resultSet.getString("name");
			String dateOB=resultSet.getString("dob");
			int cousreId=resultSet.getInt(4);			
			System.out.printf("%-10d%-10s%25s%15d\n",id,name,dateOB,cousreId);
		}
	}
}
