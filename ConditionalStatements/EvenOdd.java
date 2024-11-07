package Nov5;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		switch(n%2) {
			case 0:System.out.println(n+" is an Even number.");
					break;
			case 1:System.out.println(n+" is a odd number.");
				break;
		}
	}
}
