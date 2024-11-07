package Nov6;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=0,n2=1;
		if(n==1) {
			System.out.println("The fibbonacci series of "+n+" term is "+n1);
			return;
		}
		else if(n==2) {
			System.out.println("The fibbonacci series of "+n+" terms are :");
			System.out.print(n1+" ");
			System.out.print(n2+" ");
			return;
		}
		System.out.println("The fibbonacci series of "+n+" terms are :");
		System.out.print(n1+" ");
		System.out.print(n2+" ");
//		for(int i=3;i<=n;i++) {
//			int temp=n1+n2;
//			System.out.print(temp+" ");
//			n1=n2;
//			n2=temp;
//		}
		int i=3;
		while(i<=n) {
			int temp=n1+n2;
			System.out.print(temp+" ");
			n1=n2;
			n2=temp;
			i++;
		}
	}
}
