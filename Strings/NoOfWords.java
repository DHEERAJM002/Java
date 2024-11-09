package Nov9;

import java.util.Scanner;

public class NoOfWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("The string is :"+s);
		String words[]=s.split(" ");
		System.out.println("Number of words in the string : "+s+" are: "+words.length);
	}
}
