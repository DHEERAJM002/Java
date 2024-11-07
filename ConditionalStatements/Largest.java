package Nov5;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a+" is greater than "+b);
		else if(a==b)
			System.out.println(a+" is equal to "+b);
		else
			System.out.println(b+" is greater than "+a);
		
	}
}
