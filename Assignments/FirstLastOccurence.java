package Nov22;

import java.util.Scanner;

public class FirstLastOccurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String c=sc.next();
		int posFirst=Integer.MIN_VALUE,posLast=Integer.MAX_VALUE;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==c.charAt(0)) {
				posFirst=i;
				break;
			}
		for(int i=s.length()-1;i>=0;i--)
			if(s.charAt(i)==c.charAt(0)) {
				posLast=i;
				break;
			}
		String sol="";
		for(int i=0;i<s.length();i++) {
			if(i!=posFirst && i!=posLast)
				sol=sol+s.charAt(i);
		}
		System.out.println(sol);
	}
}
