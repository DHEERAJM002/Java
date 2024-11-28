package com.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentOperations {
private static Connection conn;
private static Statement stmt;
private static ResultSet rs;
private static int sid,sage,ret;
private static float sfees;
private static String semail,sname,sdob;
private static String sql;
private static Scanner sc = new Scanner(System.in);
private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void getAllStudents() throws ClassNotFoundException, SQLException {
		conn = DatabaseConnection.getConnection();
		stmt = conn.createStatement();
		//System.out.println("connection ="+conn);
		 sql = "select * from student";
		 rs = stmt.executeQuery(sql);
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s","SID","SNAME","SAGE","SEMAIL","SFFES","SDOB");
		  System.out.println();
		  while(rs.next()) {
			  sid = rs.getInt("sid"); //rs.getInt(1);
			  sname = rs.getString("sname");
			  sage = rs.getInt("sage");
			  semail = rs.getString("semail");
			  sfees = rs.getFloat("sfees");
			  sdob = rs.getString("sdob");
		//System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+semail+"\t"+sfees+"\t"+sdob);
			  System.out.printf("%-20d%-20s%-20d%-20s%-20.2f%-20s",sid,sname,sage,semail,sfees,sdob);	
	          System.out.println();  
		  }
		
	}

	public static void getStudentById() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		conn = DatabaseConnection.getConnection();
		stmt = conn.createStatement();
		System.out.println("Enter student id");
		sid = Integer.parseInt(br.readLine());
		sql = "select * from student where sid="+sid;
		
         rs = stmt.executeQuery(sql);
	    
	    if(rs.next()) {
	    	//System.out.println("SID\tSNAME\tSAGE\tSEMAIL\tSFEES\tSDOB");
	    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s","SID","SNAME","SAGE","SEMAIL","SFFES","SDOB");
	    System.out.println();
	    sid = rs.getInt("sid"); //rs.getInt(1);
			  sname = rs.getString("sname");
			  sage = rs.getInt("sage");
			  semail = rs.getString("semail");
			  sfees = rs.getFloat("sfees");
			  sdob = rs.getString("sdob");
		//System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+semail+"\t"+sfees+"\t"+sdob);
   System.out.printf("%-20d%-20s%-20d%-20s%-20f%-20s",sid,sname,sage,semail,sfees,sdob);	
              System.out.println();
	    
	    }
	    else {
	    	System.out.println("Student not exists");
	    }
		
	}

	public static void updateStudentById() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		conn = DatabaseConnection.getConnection();
		stmt = conn.createStatement();
		System.out.println("Enter student id");
		sid = Integer.parseInt(br.readLine());
		
		String s = "select * from student where sid ="+sid;
		
	    rs = stmt.executeQuery(s);
       
	    if(rs.next()) {
	    	while(true) {
	    	 //menu
	    	System.out.println("****Update menu*******");
	    	System.out.println("1.Update email");
	    	System.out.println("2.Change age");
	    	System.out.println("3.Change DOB");
	    	System.out.println("4.Change fees");
	    	
	    	System.out.println("Enter your choice");
	    	int upch =sc.nextInt();
	    	
	    	switch(upch) {
	    	case 1: //change email
	    		    System.out.println("Change email");
	    		    System.out.println("Enter new email id");
	    		    String newemail = br.readLine();
	    		    sql = "update student set semail='"+newemail+"' where sid="+sid;
	    		    ret = stmt.executeUpdate(sql);
	    		    if(ret>0) {
	    		    	System.out.println("Email  changed successfully");
	    		    }else {
	    		    	System.out.println("Error");
	    		    }
	    		    break;
	    	case 2: //Change age
	    		    System.out.println("change age");
	    		    System.out.println("Enter age");
	    		    int age= Integer.parseInt(br.readLine());
	    		    sql = "update student set sage='"+age+"' where sid="+sid;
	    		    ret = stmt.executeUpdate(sql);
	    		    if(ret>0) {
	    		    	System.out.println("Age  changed successfully");
	    		    }else {
	    		    	System.out.println("Error");
	    		    }
	    		    break;
	    	case 3: //change dob
	    		    System.out.println("Change dob");
	    		    System.out.println("Enter new dob");
	    		
	    		    String dob = br.readLine();
	    		    sql = "update student set sdob='"+dob+"' where sid="+sid;
	    		    ret = stmt.executeUpdate(sql);
	    		    if(ret>0) {
	    		    	System.out.println("dob  changed successfully");
	    		    }else {
	    		    	System.out.println("Error");
	    		    }
	    		    break;
	    	case 4: //change fees
	    		     System.out.println("Change age");
	    		     System.out.println("Enter age");
		    		    float fees= Float.parseFloat(br.readLine());
		  
		    		    sql = "update student set sfees='"+fees+"' where sid="+sid;
		    		    ret = stmt.executeUpdate(sql);
		    		    if(ret>0) {
		    		    	System.out.println("Fees  changed successfully");
		    		    }else {
		    		    	System.out.println("Error");
		    		    }
	    		     break;
	        default: System.out.println("Invalid input (choice can be between 1 to 4");
	    		    
    	}
	    	System.out.println("Do you want to countinue update operation");
	    	System.out.println("press yes to continue else no to stop");
	    	String up = sc.next();
	    	if(up.equals("no"))
	    		break;
	    	
	  	}//while true
	    	
	   }else {
		System.out.println("ID not exits");
	}
	}
	public static void deleteStudentById() throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		conn = DatabaseConnection.getConnection();
		stmt = conn.createStatement();
		System.out.println("Enter student id");
		sid = Integer.parseInt(br.readLine());
		sql = "select * from student where sid="+sid;
		
         rs = stmt.executeQuery(sql);
	    
	    if(rs.next()) {
	    	sql="delete from student where sid="+sid;
	    	int response=stmt.executeUpdate(sql);
	    	if(response>0)
	    		System.out.println(response+" records deleted");
	    	else
	    		System.out.println("Failed to delete a record");
	    
	    }
	    else {
	    	System.out.println("Student not exists");
	    }
		
	}

	public static void addStudent() throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		conn = DatabaseConnection.getConnection();
		stmt = conn.createStatement();
		System.out.println("Enter the name:");
		
		String name=br.readLine();
		System.out.println("Enter the age");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter the email address");
		sc.nextLine();
		String email=br.readLine();
		System.out.println("Enter the dob");
		String dob=br.readLine();
		System.out.println("Enter the fees");
		float fees=Float.parseFloat(br.readLine());
		String query="INSERT INTO STUDENT (sname,sage,semail,sfees,sdob) values ('"+name+"',"+age+",'"+email+"',"+fees+",'"+dob+"');";
		int res=stmt.executeUpdate(query);
	    if(res>0)
	    	System.out.println("added the student");
	    else
	    	System.out.println("Failed to add the student");
	
	}
}
