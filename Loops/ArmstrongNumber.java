package Nov6;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt(),noOfDigits=0;
		int temp=n,temp1=n;
		while(n!=0) {
			noOfDigits++;
			n/=10;
		}
		while(temp!=0) {
			int k=1;
			for(int i=0;i<noOfDigits;i++) {
				k*=temp%10;
			}
			n+=k;
			temp/=10;
		}
		if(temp1==n)
			System.out.println(temp1+" is an Armstrong Number.");
		else
			System.out.println(temp1+" is not an Armstrong Number.");
			
	}
}
