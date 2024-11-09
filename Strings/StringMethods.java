package Nov9;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello1");
		String s4=new String("Hello1");
		if(s1==s2)
			System.out.println("s1 and s2 are equal");
		else
			System.out.println("s1 and s2 are not equal");
		if(s3==s4)
			System.out.println("s3 and s4 are equal");
		else
			System.out.println("s3 and s4 are not equal");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username and password:");
		String uname=sc.next(),password=sc.next();
		if(uname.equals("Admin")&&password.equals("Admin@123")){
			System.out.println("Valid user");
		}
		else
			System.out.println("Invalid user");
	}
}
