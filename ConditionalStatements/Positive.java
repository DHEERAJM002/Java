package Nov5;

import java.util.Scanner;

public class Positive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		if(a>0)
			System.out.println(a+" is a positive number.");
		else if(a==0)
			System.out.println(a+" is zero.");
		else
			System.out.println(a+" is a negative number.");
		
	}
}
