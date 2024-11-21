package Nov22;

import java.util.Scanner;

public class IntegersAsStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		n2=n2*n1;
		String sol=Integer.toString(n2);
		System.out.println(sol);
	}
}
