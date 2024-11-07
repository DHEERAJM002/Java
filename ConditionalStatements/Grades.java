package Nov5;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name:");
		String name=sc.nextLine();
		System.out.println("Enter marks secured:");
		int marks=sc.nextInt();
		if(marks<0 || marks>100) {
			System.out.println("Invalid marks");
			return;
		}
		char grade;
		if(marks<=100 && marks>=90)
			grade='A';
		else if(marks>=80)
			grade='B';
		else if(marks>=50)
			grade='C';
		else if(marks>=35)
			grade='D';
		else
			grade='E';
		System.out.println("Student: "+name);
		System.out.println("Grade: "+grade);
	}
}
