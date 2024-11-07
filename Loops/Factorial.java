package Nov6;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int fact=1;
//		for(int i=1;i<=n;i++)
//			fact*=i;
		//using while loop
		int j=1;
		fact=1;
		while(j<=n) {
			fact*=j;
			j++;
		}
		System.out.println("Then factorial of "+n+" is "+fact);
	}
}
