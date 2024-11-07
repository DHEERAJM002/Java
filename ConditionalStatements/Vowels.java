package Nov5;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character:");
		String c=sc.next();
		boolean flag=false;
		switch(c) {
		case "a":flag=true;
				break;
		case "e":flag=true;
				break;
		case "i":flag=true;
				break;
		case "o":flag=true;
				break;
		case "u":flag=true;
				break;
		case "A":flag=true;
				break;
		case "E":flag=true;
			break;
		case "I":flag=true;
			break;
		case "O":flag=true;
			break;
		case "U":flag=true;
			break;
		default:flag=false;
				break;
		}
		if(flag)
			System.out.println( c+" is a vowel");
		else
			System.out.println( c+" is a consonant");
	}
}
