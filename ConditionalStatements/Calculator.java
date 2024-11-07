package Nov5;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("1.Adition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter the choice:");
		int ch=sc.nextInt();
		int solution=0;
		switch(ch) {
		case 1:solution=n1+n2;
				break;
		case 2:solution=n1-n2;
				break;
		case 3:solution=n1*n2;
			break;
		case 4:if(n2==0) {
				System.out.println("Divide by zero error");
				return;
			}
			else {
				solution=n1-n2;
				break;
			}
		default:System.out.println("Enter a valid choice.");
				break;
		}
		System.out.println("Result is "+solution);
	}
}
