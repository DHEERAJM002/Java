package Nov9;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("The string is :"+s);
		String s1=s.toLowerCase();
		int cnt=0;
		for(int j=0;j<s1.length();j++) {
			char i=s1.charAt(j);
			if(i=='a'||i=='e'||i=='o'||i=='u'||i=='i')
				cnt++;
		}
		System.out.println("Number of vowels in the string : "+s+" are: "+cnt);
	}
}
