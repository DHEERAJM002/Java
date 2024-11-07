package Nov6;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt(),reverse=0;
		int temp=n;
		while(n!=0) {
			reverse=reverse*10+n%10;
			n/=10;
		}
		System.out.println("Reverse of "+temp+" is "+reverse);
		if(temp==reverse)
			System.out.println(temp+" is a Palindrome.");
		else
			System.out.println(temp+" is not a Palindrome.");
			
	}
}
