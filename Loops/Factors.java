package Nov6;

import java.util.Scanner;
class Prime{
	int n,cnt;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		cnt=0;
	}
	void check() {
		System.out.println("Factors of "+n+" are:");
		for(int i=1;i<=n;i++)
			if(n%i==0) {
				System.out.print(i+" ");
				cnt++;
			}
		System.out.println();
		if(cnt==2)
			System.out.println(n+" is a Prime Number");

	}
}
public class Factors {
	public static void main(String[] args) {
		Prime obj=new Prime();
		obj.input();
		obj.check();
	}
		
}
