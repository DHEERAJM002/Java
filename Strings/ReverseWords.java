package Nov9;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("The string is :"+s);
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String revWord="";
			for(int j=words[i].length()-1;j>=0;j--)
				revWord=revWord+words[i].charAt(j);
			words[i]=revWord;
		}
		String rev="";
		for(int i=0;i<words.length;i++) {
			rev+=words[i];
			rev+=" ";
		}
		System.out.println("Reverse of words in the string : "+s+" are: "+rev);
	}
}
