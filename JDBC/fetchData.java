package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class fetchData {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
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
		System.out.println("Coonection Object "+con);
		statement=con.createStatement();
		System.out.println("Statement Object "+statement);
		String command="SELECT * FROM STUDENT;";
		resultSet=statement.executeQuery(command);
		int id=0,cousreId=0;
		String name=null,dateOB=null;
		System.out.printf("%-10s%-10s%25s%15s\n","ID","Name","Date of Birth","Course Id");
		while(resultSet.next()) {
			id=resultSet.getInt("id");
			name=resultSet.getString("name");
			dateOB=resultSet.getString("dob");
			cousreId=resultSet.getInt(4);			
			System.out.printf("%-10d%-10s%25s%15d\n",id,name,dateOB,cousreId);
		}
		con.close();
	}

}
