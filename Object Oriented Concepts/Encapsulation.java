package Nov11;

import java.util.Scanner;

class Student{
	//Instance variables
	int sid;
	String sname;
	float fees;
	//Constructor will be called implicitly upon creation of an object
	//It is used for initializing the data members of an object
	public Student() {
		sid=1;
		sname="Alex";
		fees=0;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student id:");
		sid=sc.nextInt();
		System.out.println("Enter the student name:");
		sname=sc.next();
		System.out.println("Enter the student fees:");
		fees=sc.nextFloat();
	}
	void display() {
		System.out.println("Student ID : "+sid);
		System.out.println("Student name : "+sname);
		System.out.println("Student fees : "+fees);
	}
}
class Employee{
	private int eid;
	private String ename,deptName;
	private float salary;
	public Employee() {
		eid=1;
		ename="Alex";
		deptName="Sales";
		salary=8500;
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id:");
		eid=sc.nextInt();
		System.out.println("Enter the employee name:");
		ename=sc.next();
		System.out.println("Enter the Department name:");
		deptName=sc.next();
		System.out.println("Enter the employee salary:");
		salary=sc.nextFloat();
	}
	void display() {
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee name : "+ename);
		System.out.println("Department : "+deptName);
		System.out.println("Employee salary : "+salary);
	}
}
public class Encapsulation {
	public static void main(String[] args) {
//		Student studentObj=new Student();
//		studentObj.display();
//		studentObj.input();
//		studentObj.display();
//		System.out.println(studentObj.sname);
		Employee employee1=new Employee();
		employee1.input();
		employee1.display();
	}
}
